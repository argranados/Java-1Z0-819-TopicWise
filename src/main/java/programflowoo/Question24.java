package programflowoo;

public class Question24 {

    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {            // 1 2    4  5
                continue;
            }
            sum += start; //Line n1         // 1    4      9
        } while(++start <= 10);             // 2   3 4  5
        System.out.println(sum);
    }
}
