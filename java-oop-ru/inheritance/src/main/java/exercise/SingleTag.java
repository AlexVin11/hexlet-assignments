package exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

// BEGIN
@Getter
@Setter
public class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
// END
