package objectorientesapproach2;

class Parent {
    int i = 10;
    Parent(int i) {
        super();
        this.i = i;
    }
}

class Child extends Parent {
    int j = 20;

    Child(int j) {
        super(0);
        this.j = j;
    }

    Child(int i, int j) {
        super(i);
//        this(j);        // only one call in constructor chaining
    }

}

public class Q62 {

    public static void main(String[] args) {
        Child child = new Child(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}
