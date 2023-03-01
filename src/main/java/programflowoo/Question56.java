package programflowoo;

public class Question56 {

    public static void main(String[] args) {
        new Outer().new Inner().printName();
    }
}

class Outer {
    private String name = "NOW OR NEVER";
    //Insert inner class definition here
    class Inner {
        public void printName(){
            System.out.println(name);
            System.out.println(Outer.this.name);
        }
    }
}
