package datatypes;

public class Question46 {

    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;  // 1:ONE
        String str2 = i2 + s1;  // 1:ONE

        System.out.println(str1 == "1:ONE");  // true
        System.out.println(str2 == "1:ONE");  // true ?
    }
}
