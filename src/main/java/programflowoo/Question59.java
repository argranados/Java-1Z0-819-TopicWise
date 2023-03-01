package programflowoo;

class Outerr {
    class Innerr {
        public void m() {
            System.out.println("CHANGE IS GOOD");
        }
    }
}

public class Question59 {

    public static void main(String[] args) {
//        Inner obj = new Outerr().new Inner().m();
        Outerr.Innerr obj5 = new Outerr().new Innerr();
        obj5.m();
        var obj4 = new Outerr().new Innerr();
        obj4.m();
//        Outer.Inner  obj1 = new Outer().new Inner().m();
    }


}
