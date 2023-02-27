package datatypes;

public class Question20 {

    public static void main(String[] args) {
        String text = null;

        System.out.println(text.repeat(3));
//        System.out.println(null + null + null);
        System.out.println(null + "null" + null);
//        System.out.println(text *= 3);
        System.out.println(text += "null".repeat(2));
        System.out.println(text + text + text);
        text += null; System.out.println((text.concat(null)));
    }
}
