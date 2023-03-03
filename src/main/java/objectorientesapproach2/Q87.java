package objectorientesapproach2;

class Paper_87 {
    static String getType() { //Line n1         // STATIC METHOD
        return "GENERIC";
    }
}

class RuledPaper_87 extends Paper_87 {
    static String getType() { //Line n2
//    String getType() { //Line n2                // STATIC METHOD CANNOT BE OVERRIDEN
        return "RULED";
    }
}

public class Q87 {

    public static void main(String[] args) {
        Paper_87 paper = new RuledPaper_87(); //Line n3
        System.out.println(paper.getType()); //Line n4
    }
}
