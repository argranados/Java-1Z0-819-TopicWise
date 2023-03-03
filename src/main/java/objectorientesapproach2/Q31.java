package objectorientesapproach2;

public class Q31 {
    static int a = 10000;
    static {
        a = -a--;
    }
    {
        a = -a++;
    }

    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(Q31.a);
    }
}
