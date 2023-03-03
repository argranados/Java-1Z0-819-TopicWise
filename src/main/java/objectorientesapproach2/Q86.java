package objectorientesapproach2;

class Base_86 {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived_86 extends Base {
    static void print() { //Line n2
        System.out.println("DERIVED");
    }
}

public class Q86 {

    public static void main(String[] args) {
        Base_86 b = null;
//        Derived_86 d = (Derived_86) b; //Line n3         compilation ERROR
//        d.print(); //Line n4
    }
}
