package datatypes;

public class Question62 {

    public static void main(String[] args) {
        String str1 = "Book"; //Line n1
        String str2 = new String(new char[] {'B', 'o', 'o', 'k'}); //Line n2
        String str3 = new String("Book"); //Line n3
        System.out.println((str1 == str2) + ":" + (str1 == str2.intern())); //Line n4  false:true
        System.out.println((str2 == str3) + ":" + (str2.intern() == str3.intern())); //Line n5 false:true
    }
}
