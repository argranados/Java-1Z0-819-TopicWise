package programflowoo;

class Foo {
    public static void m1() { //Line n1
        System.out.println("Foo : m1()");
    }
    class Bar {
//        public static void m1() { //Line n2  static in inner classes not supported in java 11
//            System.out.println("Bar : m1()");
//        }
    }
}

public class Question61 {

    public static void main(String[] args) {
        var foo = new Foo2(); //Line n3
        var bar = foo.new Bar(); //Line n4
//        bar.m1();
    }
}
