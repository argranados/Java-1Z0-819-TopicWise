package programflowoo;

public class Question54 {

    public static void main(String[] args) {
        Question54 p1 = new Question54(); //Line n1
        Question54 p2 = new Question54(); //Line n2
        p1 = p2; //Line n3
        p1 = null; //Line n4
    }
}
