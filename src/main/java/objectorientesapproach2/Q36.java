package objectorientesapproach2;

public class Q36 {

    Integer i = 10; //Line n1
    {
        Integer i = 2; //Line n2        Se declara nueva variable dentro de bloque
    }
    public static void main(String[] args) {
        System.out.println(new Q36().i); //Line n3
    }
    { i--; } //Line n4
}
