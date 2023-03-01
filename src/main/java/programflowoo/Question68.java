package programflowoo;

class A68 {
    public void someMethod(final String name) {
        final class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();

    }
}

public class Question68 {

    public static void main(String[] args) {
        new A68().someMethod("World!");
    }
}
