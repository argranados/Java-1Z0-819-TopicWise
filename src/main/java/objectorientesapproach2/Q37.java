package objectorientesapproach2;

class Super {
    { System.out.print("A");}       // FOURT super initializer
    Super(String str) {
        System.out.print(str);     // FIFTH super contructor
    }
    static {
        System.out.print("1");          //FIRST static of super
    }
    { System.out.print("B");}
}

class Sub extends Super {
    static { System.out.print("2"); }   // then FIRST static of sub
    Sub(String str) {                   // SECOND constructor
        super(str);                     // THIRD super constructor -
        System.out.print(str);
    }
    { System.out.print("C"); }          // SIX sub class Initializer
    static {
        System.out.print("3");
    }
}

public class Q37 {

    public static void main(String[] args) {
        new Sub("Z");
    }
}
