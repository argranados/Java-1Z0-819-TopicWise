package programflowoo;

public class Question91 implements I91{
    @Override
    public void m1() {
        System.out.println("Interface implements interface, class, abstract class");
    }

    public static void main(String[] args) {
        new Question91().m1();
    }
}
