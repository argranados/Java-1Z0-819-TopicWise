package programflowoo;

public class Question50 {
    int count;

    private static void increment(Question50 counter) {
        counter.count++;
    }

    public static void main(String[] args) {
        Question50 c1 = new Question50();
        Question50 c2 = c1;
        Question50 c3 = null;
        c2.count = 1000;
        increment(c2);

    }
}
