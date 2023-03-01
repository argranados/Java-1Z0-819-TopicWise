package programflowoo;

class AA {
    AA() {
        System.out.print(1);
    }
    class BB {
        BB() {
            System.out.print(2);
        }
    }
}

public class Question60 {

    public static void main(String[] args) {
//        BB obj = new AA().new BB();
        AA.BB obj = new AA().new BB();
        var obj1 = new AA().new BB();
    }
}
