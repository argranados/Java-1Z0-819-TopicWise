package datatypes;

public class Question27 {

    public static void main(String[] args) {
        int m = 20;
        int var = --m * m++ + m-- - --m;   //  19 * 19 + 20 - 18
        System.out.println("m = " + m);
        System.out.println("var = " + var);
    }
}
