package objectorientesapproach2;

class Super56 {
    Super56(int i) {
        System.out.println(100);
    }

    Super56(){}             // needs default
}

class Sub56 extends Super56 {
    Sub56() {               // needs default of Super otherwise -> error
        System.out.println(200);
    }
}

public class Q56 {

    public static void main(String[] args) {
        new Sub56();
    }
}
