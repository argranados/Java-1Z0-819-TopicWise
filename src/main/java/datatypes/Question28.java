package datatypes;

public class Question28 {

    public static void main(String[] args) {
        int x = 7;
        boolean res = x++ == 7 && ++x == 9 || x++ == 9;  // 7 == 7 && 9 == 9 || 9 == 9
        System.out.println("x = " + x);  // 10
        System.out.println("res = " + res); //  t & t || t
    }
}
