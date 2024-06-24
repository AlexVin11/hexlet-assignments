package exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.List;

// BEGIN
@Getter
@Setter
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> childTags;

    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> childTags) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.childTags = childTags;
    }

    @Override
    public String toString() {
        String closingTag = "</"
                + super.getTagName()
                + ">";
        var result = new StringBuilder();
        var tagToString = super.toString();
        result.append(tagToString);
        result.append(this.tagBody);
        for (var childTag : this.childTags) {
            result.append(childTag.toString());
        }
        result.append(closingTag);
        return result.toString();
    }
}
// END
