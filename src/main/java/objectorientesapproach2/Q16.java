package objectorientesapproach2;

public class Q16 {
    public static void print() {
        System.out.println("STATIC METHOD!!!");
    }

    public static void main(String[] args) {
        Q16 obj = null; //Line n1
        obj.print(); //Line n2
    }
}
