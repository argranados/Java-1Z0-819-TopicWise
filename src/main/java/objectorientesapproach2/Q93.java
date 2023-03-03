package objectorientesapproach2;

class Super_93 {
    final int NUM = -1; //Line n1     // remove final
//    int NUM = -1; //Line n1
}

class Sub_93 extends Super_93 {
    /*INSERT*/
    Object NUM = 0;      // add NUM
}

public class Q93 {

    public static void main(String[] args) {
        Sub_93 obj = new Sub_93();
        obj.NUM = 200; //Line n2
        System.out.println(obj.NUM); //Line n3
    }
}
