package objectorientesapproach2;

public class Q82 {

    public static void main(String[] args) {
        Shape_82 s = new Square_82();
        System.out.println(s.side + ":" + s.getSide());
    }
}

class Shape_82 {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
}

class Square_82 extends Shape_82 {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}
// estado referencia
// comportamiento instance
