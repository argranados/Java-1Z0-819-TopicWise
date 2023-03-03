package objectorientesapproach2;

public class Q13 {
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        Q13.change(i1);
        System.out.println(i1);
    }
}
