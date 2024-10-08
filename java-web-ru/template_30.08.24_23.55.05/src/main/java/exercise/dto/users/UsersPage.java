package exercise.dto.users;

import exercise.model.User;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@AllArgsConstructor
@Getter
public class UsersPage{
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UsersPage(List<User> users) {
        this.users = users;
    }
}
// END
