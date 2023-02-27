package datatypes;

public class Question37 {
    public static void main(String[] args) {
        String str = "Think"; //Line n3
        change(str); //Line n4
        System.out.println(str); //Line n5
    }

    private static void change(String s) {
        s.concat("_Twice"); //Line n9
    }
}
