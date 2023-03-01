package programflowoo;

class Foo2 {
    static { //static initializer block
        System.out.print("A");
    }
    class Bar {
//        static { //static initializer block   static in inner classes NOT supported in java 11
            {
            System.out.print("B");
        }
    }
}

public class Question65 {

    public static void main(String[] args) {
        new Foo2().new Bar();
    }
}
