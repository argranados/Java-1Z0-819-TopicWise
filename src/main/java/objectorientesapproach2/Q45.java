package objectorientesapproach2;

public class Q45 {
    static String msg; //Line n1
    public static void main(String[] args) {
//        String msg; //Line n2       need init
        String msg="x"; //Line n2
        if(args.length > 0) {
            msg = args[0]; //Line n3
        }
        System.out.println(msg); //Line n4
    }
}
