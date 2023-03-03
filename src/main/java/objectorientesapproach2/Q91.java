package objectorientesapproach2;

class Base_91 {
    int id = 1000; //Line n1

    Base_91() {
        Base_91(); //Line n2
    }

    void Base_91() { //Line n3
        System.out.println(++id); //Line n4
    }
}

class Derived_91 extends Base_91 {
    int id = 2000; //Line n5

    Derived_91() {} //Line n6

    void Base_91() { //Line n7
        System.out.println(--id); //Line n8
    }
}

public class Q91 {

    public static void main(String[] args) {
        Base_91 base = new Derived_91(); //Line n9
    }
}
