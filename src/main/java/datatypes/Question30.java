package datatypes;

public class Question30 {

    public static void main(String[] args) {
        int i = 2;
        boolean res = false;
        res = i++ == 2 || --i == 2 && --i == 2; // 2 == 2 || 2 == 2 && 1 == 2
        System.out.println(i); // t || t && f    = 1
    }  //??
}
