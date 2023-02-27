package datatypes;

public class Question86 {

    public static void main(String[] args) {
        var x = 7.85; //Line n1
        var y = 5.25f; //Line n2
        var a = (int)x + (int)y; //Line n3
        var b = (int)(x + y); //Line n4
        System.out.println(a + b);
    }
}
