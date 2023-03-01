package programflowoo;

class Outer67 {
    public void print(int x) {
        class Inner67 {
            public void getX() {
                System.out.println(1);   // x need to be final or efectively final
//                System.out.println(++x);   // x need to be final or efectively final
            }
        }
        Inner67 inner = new Inner67();
        inner.getX();
    }
}

public class Question67 {

    public static void main(String[] args) {

        new Outer67().print(100);
    }
}
