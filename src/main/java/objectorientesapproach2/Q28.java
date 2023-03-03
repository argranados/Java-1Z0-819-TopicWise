package objectorientesapproach2;

public class Q28 {
    String quote = null;
    public Q28() {
    }

    public Q28(String str) {
        quote = str;
    }

    public void display() {
        System.out.println(quote);
    }

    public static void main(String[] args) {
        Q28 q1 = new Q28();
        Q28 q2 = new Q28("NEVER GIVE UP!");
        q1.display();
        q1.display();
    }
}
