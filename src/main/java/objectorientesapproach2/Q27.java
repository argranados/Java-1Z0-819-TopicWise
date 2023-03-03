package objectorientesapproach2;

public class Q27 {
    String msg = null;

    public Q27() {
        this("Good Morning!");
    }

    public Q27(String str) {
        msg = str;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Q27 g1 = new Q27();
        Q27 g2 = new Q27("Good Evening!");
        g1.display();
        g2.display();
    }
}
