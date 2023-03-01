package programflowoo;

interface Flyable {
    void fly();
}

public class Question78 {

    public static void main(String[] args) {
//        Flyable flyable = new Flyable() {};
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying hiigh");
            }
        };
    }
}