package programflowoo;

class Outer88 {
    private static int i = 10;
//    private int j = 20;   // need static variable
    private static int j = 20;

    static class Inner88 {
        void add() {
//            System.out.println(i + j);   // need static variable
            System.out.println(i + j);
        }
    }
}

public class Question88 {

    public static void main(String[] args) {
        Outer88.Inner88 inner = new Outer88.Inner88();
        inner.add();
    }
}
