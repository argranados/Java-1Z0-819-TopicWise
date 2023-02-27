package datatypes;

public class Question63 {

    public static void main(String[] args) {
        String s1 = new String("ALL IS WELL"); //Line n1
//        String s2 = new String("ALL IS WELL"); //Line n1
//        String s2 = new String("ALL IS WELL").intern(); //Line n2
//        String s2 = new String("ALL IS WELL").intern(); //Line n2
//        String s1 = "ALL IS WELL";
//        String s2 = "ALL IS WELL";
        String s2 = s1.toString();
        System.out.println(s1 == s2); //Line n3
//        System.out.println(s1.toString() == s2.toString()); //Line n3
    }
}
