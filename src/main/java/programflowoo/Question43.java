package programflowoo;

public class Question43 {

    public static void main(String[] args) {

        var res = ""; //Line n1
        String [] arr = {"Dog", null, "Friendly"};
        for(String s : arr) { //Line n2
            res += String.join("-", s); //Line n3
        }
        System.out.println(res); //Line n4
    }
}
