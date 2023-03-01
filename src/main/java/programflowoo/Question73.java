package programflowoo;

class Greet {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class Question73 {

    public static void main(String[] args) {
        Greet obj = new Greet() {
            public void SayHello() {
                System.out.println("HELLO!");
            }
        };
        obj.sayHello();
    }
}
