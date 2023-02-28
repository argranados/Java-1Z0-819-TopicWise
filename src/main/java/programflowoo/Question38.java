package programflowoo;

public class Question38 {

    public static void main(String[] args) {
        var i = 1;
        var j = 5;
        var k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;            //2 4    2 3   2 2   3 1
                C: while(true) {
                    k += i + j;  //6    11   15    19
                    if(i == j)
                        break A;   //A
                    else if (i > j)
                        continue A;  //A
                    else
                        continue B;   //B  B
                }
            }
        }
        System.out.println(k);

    }
}
