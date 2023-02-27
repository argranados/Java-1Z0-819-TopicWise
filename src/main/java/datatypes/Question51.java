package datatypes;

public class Question51 {

    public static void main(String[] args) {
        final String str = "+";
        System.out.println(str.repeat(2) == "++");  // en el string pool solo esta "+"
//        System.out.println(str.repeat(2).length());
//        System.out.println(str.repeat(2));
    }
}
