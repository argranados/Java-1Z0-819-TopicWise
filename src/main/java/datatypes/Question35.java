package datatypes;

import java.util.Locale;

public class Question35 {

    public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";
        System.out.println(s1.equals(s2.toUpperCase(Locale.ROOT)));
        System.out.println(s2.equals(s1.toLowerCase(Locale.ROOT)));
        System.out.println(s2.length() == s1.length());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contentEquals(s2.toUpperCase()));
    }
}


