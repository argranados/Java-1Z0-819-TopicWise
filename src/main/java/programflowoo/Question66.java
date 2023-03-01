package programflowoo;

class Outer66 {
    Outer66() {
        System.out.print(2);
    }
    /*INSERT 1*/
    static {
        System.out.print(1);
    }

    class Inner66 {
        Inner66() {
            System.out.print(4);
        }
        /*INSERT 2*/
        {
            System.out.print(3);
        }
    }
}

public class Question66 {

    public static void main(String[] args) {
        new Outer66().new Inner66();
    }
}
