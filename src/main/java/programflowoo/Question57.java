package programflowoo;

public class Question57 {

    class A {
        void m() {
            System.out.println("OVER AND OUT");
        }
    }

    public static void main(String[] args) {
        Question57.A a1 = new Question57().new A();
        a1.m();

//        var a4 = new A();
//        a4.m();
    }
}
