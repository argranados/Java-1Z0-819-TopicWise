package programflowoo;

public class Question86 {
    private static class B86 {
        private void log() {
            System.out.println("BE THE CHANGE");
        }
    }

    public static void main(String[] args) {
        B86 obj1 = new B86();
        obj1.log();

        Question86.B86 obj2 = new Question86.B86();
        obj2.log();

        var obj5 = new Question86.B86();
        obj5.log();

    }
}
