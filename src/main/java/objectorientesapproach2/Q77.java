package objectorientesapproach2;

class M77 { }
class N77 extends M77 { }
class O77 extends N77 { }
class P77 extends O77 { }

public class Q77 {

    public static void main(String[] args) {
        M77 obj = new O77();
        if(obj instanceof M77)
            System.out.print("M");
        if(obj instanceof N77)
            System.out.print("N");
        if(obj instanceof O77)
            System.out.print("O");
        if(obj instanceof P77)
            System.out.print("P");
    }
}
