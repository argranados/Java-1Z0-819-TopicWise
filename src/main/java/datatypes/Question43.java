package datatypes;

public class Question43 {

    public static void main(String[] args) {
        String str = " "; //single space
        boolean b1 = str.isEmpty();
        boolean b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n1

        str.strip(); //Line n2
        b1 = str.isEmpty();
        b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n3

//        String ss = "";
//        boolean b3 = ss.isEmpty();
//        boolean b4 = ss.isBlank();
//        //        System.out.println(str.length());
//        System.out.println(b3 + " : " + b4); //Line n3
    }
}
