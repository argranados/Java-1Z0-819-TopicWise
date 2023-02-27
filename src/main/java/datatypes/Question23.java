package datatypes;

public class Question23 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("INHALE ");
        String s = sb.toString() + (sb.append("EXHALE "));  // INHALE INHALE EXHALE
        System.out.println(s.strip().length());
    }
}
