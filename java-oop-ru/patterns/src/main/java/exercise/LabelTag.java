package exercise;

import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class LabelTag implements TagInterface {
    private String labelValue;
    private TagInterface childTag;

    public LabelTag(String value, TagInterface childTag) {
        labelValue = value;
        this.childTag = childTag;
    }

    @Override
    public String render() {
        return "<label>" + labelValue
                + childTag.render()
                + "</label>";
    }
}
// END
