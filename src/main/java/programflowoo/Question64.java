package programflowoo;

class P {
    private int var = 100;
    class Q {
        String var = "Java";
        void print() {
            System.out.println(var);
        }
    }
}

public class Question64 {

    public static void main(String[] args) {
        new P().new Q().print();
    }
}
