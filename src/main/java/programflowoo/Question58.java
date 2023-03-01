package programflowoo;

class A {
    private String str = "WINNERS NEVER QUIT";
    public class B {
        public B(String s) {
            if(s != null)
                str = s;
        }
        public void m1() {
            System.out.println(str);
        }
    }
}

public class Question58 {

    public static void main(String[] args) {
        new A().new B(null).m1();
    }
}
