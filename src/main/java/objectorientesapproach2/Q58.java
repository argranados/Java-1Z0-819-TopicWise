package objectorientesapproach2;

class Super58 {
    void Super58() {
        System.out.print("KEEP_");
    }
}

class Base58 extends Super58 {
    Base58() {
        Super58();
        System.out.print("GOING_");
    }
}

public class Q58 {

    public static void main(String[] args) {
        new Base58();
    }
}
