package programflowoo;

public class Question42 {

    public static void main(String[] args) {
        var res = ""; //Line n1
        String [] arr = {"1", "2", "3"};
        for(var s : arr) { //Line n2
            res += String.join(".", s); //Line n3
        }
        System.out.println(res); //Line n4
    }
}
