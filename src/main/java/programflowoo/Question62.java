package programflowoo;

public class Question62 {
    private int num1 = 100;
    class N {
        private int num2 = 200;
    }

    public static void main(String[] args) {
        Question62 outer = new Question62();
        Question62.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}
