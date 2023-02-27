package datatypes;

public class Question39 {
    public static void main(String[] args) {
        String text = "    BE YOURSELF!    "; //Contains multiple space characters
//        System.out.println(text.trim());
//        System.out.println(text.strip());
        System.out.println(text.stripLeading().stripTrailing());
    }

}
