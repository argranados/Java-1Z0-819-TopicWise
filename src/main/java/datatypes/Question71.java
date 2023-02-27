package datatypes;

public class Question71 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Friends are treasures");
        sb.delete(0, 100);
        System.out.println(sb.length());
    }
}
