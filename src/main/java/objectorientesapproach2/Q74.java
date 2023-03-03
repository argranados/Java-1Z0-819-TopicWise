package objectorientesapproach2;

public class Q74 {

    public static void main(String[] args) {
        P p = new R(); //Line n1
        System.out.println(p.compute("Go")); //Line n2
    }
}

class P {
    String compute(String str) {
        return str.repeat(3);       // gogogo
    }
}

class Q extends P {
    String compute(String str) {
        return super.compute(str.toLowerCase());  // go
    }
}

class R extends Q {
    String compute(String str) {
        return super.compute(str.replace('o', 'O')); // GO
        //2nd argument is uppercase O
    }
}