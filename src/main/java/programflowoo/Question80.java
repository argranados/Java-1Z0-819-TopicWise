package programflowoo;

public class Question80 {

    public static void main(String[] args) {
        System.out.println(new Object() {
            public String toString() {
                return "ANONYMOUS";
            }
        });
    }
}
