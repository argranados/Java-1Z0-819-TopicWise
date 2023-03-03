package objectorientesapproach2;

public class Q75 {

    public static void main(String[] args) {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
/*        obj.B(); //Line n3                // error here
        obj.C(); //Line n4*/
    }
}

class X {
    void A() {
        System.out.print("A");
    }
}

class Y extends X {
    void A() {
        System.out.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.out.print("C-");
    }
}

// el comportamiento lo toma de la referencia


