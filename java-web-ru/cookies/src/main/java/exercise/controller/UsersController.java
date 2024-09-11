package exercise.controller;

import org.apache.commons.lang3.StringUtils;
import exercise.util.Security;
import exercise.model.User;
import exercise.util.NamedRoutes;
import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.repository.UserRepository;
import exercise.dto.users.UserPage;
import io.javalin.http.NotFoundResponse;
import io.javalin.http.Context;


public class UsersController {

    public static void build(Context ctx) throws Exception {
        ctx.render("users/build.jte");
    }

    // BEGIN
    public static void create(Context ctx) {
        var firstName = StringUtils.capitalize(ctx.formParamAsClass("firstName", String.class).get());
        var lastName = StringUtils.capitalize(ctx.formParamAsClass("lastName", String.class).get());
        var password = ctx.formParamAsClass("password", String.class).get();
        var encryptedPassword = Security.encrypt(password);
        var email = ctx.formParamAsClass("email", String.class).get();
        var token = Security.generateToken();
        var user = new User(firstName, lastName, encryptedPassword, email, token);
        UserRepository.save(user);
        var cookie = ctx.cookie("token", token);
        ctx.redirect(NamedRoutes.userPath(user.getId()));
    }

    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var token = ctx.cookie("token") == null ? null : ctx.cookie("token");
        var user = UserRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Entity with id = " + id + " not found"));
        if (user == null || !user.getToken().equals(token)) {
            ctx.redirect("/users/build");
            return;
        }
        var page = new UserPage(user);
        ctx.render("users/show.jte", model("page", page));
    }
    // END
}
