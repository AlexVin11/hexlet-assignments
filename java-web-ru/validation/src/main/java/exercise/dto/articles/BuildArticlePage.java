package exercise.dto.articles;

import io.javalin.validation.ValidationError;
import java.util.Map;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

// BEGIN
@NoArgsConstructor
@Getter
public class BuildArticlePage {
    private String title;
    private String content;
    private Map<String, List<ValidationError<Object>>> errors;

    public BuildArticlePage (String title, String content, Map<String, List<ValidationError<Object>>> errors) {
        this.title = title;
        this.content = content;
        this.errors = errors;
    }
}
// END
