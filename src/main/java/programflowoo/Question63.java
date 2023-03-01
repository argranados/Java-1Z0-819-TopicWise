package programflowoo;

class X {
    class Y {
        private void m() {
            System.out.println("INNER");
        }
    }

    public void invokeInner() {
        var obj = new Y(); //Line n1
        obj.m(); //Line n2
    }
}

public class Question63 {
    public static void main(String[] args) {
        new X().invokeInner();
    }
}
