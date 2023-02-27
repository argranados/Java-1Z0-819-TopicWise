package datatypes;

public class Quesion11 {

    public static void main(String[] args) {
        extractInt(2.7);
//        extractInt(2);  //2d
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
