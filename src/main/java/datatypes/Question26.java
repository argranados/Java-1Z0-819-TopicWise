package datatypes;

public class Question26 {

    public static void main(String[] args) {
        var a = 3; //Line n1
        var b = 5; //Line n2
        var c = 7; //Line n3
        var d = 9; //Line n4
        boolean res = --a + --b < 1 && c++ + d++ > 1;  //2 + 4 < 1 && 7 + 9 > 1    7 < 1 && 16 > 1   f && t
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res); //2 5 8 10 f
    }  // ??
}
