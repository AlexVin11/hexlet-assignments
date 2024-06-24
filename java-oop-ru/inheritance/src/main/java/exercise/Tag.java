package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
@Getter
@Setter
public class Tag {
    private String tagName;
    private Map<String, String> attributes = new HashMap<>();

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes.putAll(attributes);
    }

    @Override
    public String toString() {
        var result = new StringBuilder();
        result.append("<");
        result.append(getTagName());
        var attributesOfTag = getAttributes().entrySet();
        for (var attribute : attributesOfTag) {
            result.append(" ");
            result.append(attribute.getKey());
            result.append("=\"");
            result.append(attribute.getValue());
            result.append("\"");
        }
        result.append(">");
        return result.toString();
    }
}
// END
