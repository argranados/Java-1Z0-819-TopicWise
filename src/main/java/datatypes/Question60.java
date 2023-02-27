package datatypes;

public class Question60 {

    public static void main(String[] args) {
        String str = "BEVERAGE";
        String [] arr = str.split("E", 3); //B V RAGE
        System.out.println(String.join(".", arr));
    }
}
