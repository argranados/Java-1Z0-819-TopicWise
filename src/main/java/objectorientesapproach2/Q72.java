package objectorientesapproach2;

public class Q72 {

    public static void main(String[] args) {
        System.out.println(new Child72());
    }
}

class Parent72 {
    public String toString() {
        return "Inner ";
    }
}

class Child72 extends Parent72 {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}