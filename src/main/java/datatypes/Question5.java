package datatypes;

public class Question5 {

    public static void main(String[] args) {
        byte b1 = 10; //Line n1
        int i1 = b1; //Line n2
        byte b2 = (byte)i1; //Line n3
        System.out.println(b1 + i1 );
        System.out.println(b1 + i1 + b2);
    }
}
