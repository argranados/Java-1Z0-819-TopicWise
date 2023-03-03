package objectorientesapproach2;

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
//    void m1() {     // error access modifier here
        public void m1() {      // fix
        System.out.println("Derived: m1()");
    }
}

public class Q68 {

    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}
