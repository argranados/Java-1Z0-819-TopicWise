package objectorientesapproach2;

public class Q55 {

    public static void main(String[] args) {
        new B();
    }
}

class A {
    A() {
        this(1);
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }
}

class B extends A {

}