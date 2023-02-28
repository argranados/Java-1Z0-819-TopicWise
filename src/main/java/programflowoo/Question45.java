package programflowoo;

public class Question45 {

    public static void main(String[] args) {
        String res = "";
        loop: for(var i = 1; i <= 5; i++) { //Line n1
            switch(i) {
                case 1:
                    res += "UP ";
                    break;
                case 2:
                    res += "TO ";
                    break;
                case 3:
                    break;
                case 4:
                    res += "DATE";
                    break loop;
            }
        }
        System.out.println(String.join("-", res.split(" "))); //Line n2
    }
}
