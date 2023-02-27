package datatypes;

public class Question65 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HavePatience"); //Haveatience
        sb.delete(4, 5).insert(4, " P").toString().toUpperCase();
        System.out.println(sb);
    }
}
