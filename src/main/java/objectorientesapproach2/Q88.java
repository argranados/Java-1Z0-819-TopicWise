package objectorientesapproach2;

class M_88 {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}

class N_88 extends M_88 {
//    public static void main(String[] args) { //Line n2        // cannot ovverride with STATIC
    public void main(String[] args) { //Line n2
        new M_88().main(args); //Line n3
    }
}

public class Q88 {

    public static void main(String[] args) {
//        N_88.main(args); //Line n4              // no static
    }
}
