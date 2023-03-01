package programflowoo;

abstract class Greetings {
    abstract void greet();
}

public class Question77 {

    public static void main(String[] args) {
        var obj = new Greetings() {
            @Override public void greet() {
                System.out.println("BELIEVE IN YOURSELF");
            }
        };
        obj.greet();
    }
}
