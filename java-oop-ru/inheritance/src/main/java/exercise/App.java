package exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, String> attributes1 = new LinkedHashMap<>();
        attributes1.put("class", "w-75");
        attributes1.put("id", "wop");
        Tag img = new SingleTag("img", attributes1);
        System.out.println(img.toString());
        String expected1 = "<img class=\"w-75\" id=\"wop\">";
        System.out.println("must be like this \n" + expected1);

        Map<String, String> attributes2 = new LinkedHashMap<>();
        Tag hr = new SingleTag("hr", attributes2);
        System.out.println(hr.toString());
        String expected2 = "<hr>";
        System.out.println("must be like this \n" + expected2);

        Tag div = new PairedTag(
                "div",
                Map.of("class", "y-5"),
                "",
                List.of(
                        new SingleTag("br", Map.of("id", "s")),
                        new SingleTag("hr", Map.of("class", "a-5"))
                )
        );
        System.out.println(div.toString());
        String expected3 = "<div class=\"y-5\"><br id=\"s\"><hr class=\"a-5\"></div>";
        System.out.println("must be like this \n" + expected3);
    }
}
