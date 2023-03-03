package objectorientesapproach2;

class X_90 {
    void greet() {
        System.out.println("Good Morning!");
    }
}

class Y_90 extends X_90 {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}

class Z_90 extends Y_90 {
    void greet() {
        System.out.println("Good Night!");
    }
}

public class Q90 {

    public static void main(String[] args) {
        X_90 x = new Z_90();
        x.greet(); //Line n1
        ((Y_90)x).greet(); //Line n2
        ((Z_90)x).greet(); //Line n3
    }
}

// comportamiento de las instancias !!!!!!