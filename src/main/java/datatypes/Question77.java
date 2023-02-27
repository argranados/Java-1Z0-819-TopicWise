package datatypes;

public class Question77 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(20); //Line n1
        sb.append("A".repeat(25)); //Line n2
        System.out.println(sb.toString().length()); //Line n3

        sb.setLength(10); //Line n4
        System.out.println(sb.toString().length()); //Line n5
    }
}
