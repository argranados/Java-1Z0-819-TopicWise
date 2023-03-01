package programflowoo;

class Outer69 {
    public static void sayHello() {}
    static {
        class Inner69 {
            /*INSERT*/
//            Inner69(){
            {
                System.out.println("HELLO");
            }
        }
        new Inner69();
    }
}

public class Question69 {

    public static void main(String[] args) {
        Outer69.sayHello();
    }
}
