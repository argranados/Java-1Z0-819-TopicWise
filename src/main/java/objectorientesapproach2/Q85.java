package objectorientesapproach2;

class Base_85 {
    String msg = "INHALE"; //Line n1
}

class Derived_85 extends Base_85 {
    Object msg = "EXHALE"; //Line n2
}

public class Q85 {

    public static void main(String[] args) {
        Base_85 obj1 = new Base_85(); //Line n3
        Base_85 obj2 = new Derived_85(); //Line n4
        Derived_85 obj3 = (Derived_85) obj2; //Line n5
        var var = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; //Line n6
        System.out.println(var); //Line n7
    }
}
