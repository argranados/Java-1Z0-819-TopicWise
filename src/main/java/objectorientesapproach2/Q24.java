package objectorientesapproach2;

public class Q24 {
    public String name;
    public void Q24() {         // Method NOT constructor !!!
        name = "James";
    }

    public static void main(String[] args) {
        Q24 obj = new Q24();
        System.out.println(obj.name);
    }
}
