package datatypes;

public class Question85 {

    public static void main(String[] args) {
        var m = 10; //Line n1
        var n = 20; //Line n2
        float p = m = n = 30; //Line n3     ??
        System.out.println(m + n + p); //Line n4
    }
}
