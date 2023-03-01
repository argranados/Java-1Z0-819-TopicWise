package programflowoo;

class Outer89 {
    static class Inner89 {
        static void greetings(String s) {
            System.out.println(s);
        }
    }
}

public class Question89 {

    public static void main(String[] args) {
        Outer89.Inner89 inner2 = new Outer89.Inner89();
        inner2.greetings("HELLO");

        Outer89.Inner89.greetings("HELLO");
    }
}
