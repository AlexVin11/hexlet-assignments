package exercise;

public class App {

    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static String input(String type, String value) {
        TagInterface tag = new InputTag(type, value);
        return tag.render();
    }

    public static String label(String label, TagInterface tag) {
        TagInterface labledTag = new LabelTag(label, tag);
        return labledTag.render();
    }
}
