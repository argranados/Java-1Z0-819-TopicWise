package objectorientesapproach2;

class Super_83 {
    public String num = "10"; //Line n1
}

class Sub_83 extends Super_83 {
    protected int num = 20; //Line n2
}

public class Q83 {

    public static void main(String[] args) {
        Super_83 obj = new Sub_83();
        System.out.println(obj.num += 2); //Line n3
    }
}
// estado : referencia