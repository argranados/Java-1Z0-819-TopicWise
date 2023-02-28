package programflowoo;

public class Question39 {

    public static void main(String[] args) {

        outer: for(var i = 0; i < 3; System.out.print(i)) {
            i++;
            inner: for(var j = 0; j < 3; System.out.print(j)) {
                if(i > ++j) {
                    break outer;
                }
            }
        }

    }
}
