package datatypes;

public class Question24 {

    public static void main(String[] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));  //true | false || true
        System.out.println(flag);
    }
}
