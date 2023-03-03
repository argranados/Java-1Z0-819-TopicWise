package objectorientesapproach2;

class Parent_84 {
    int var = 1000; // Line n1

    int getVar() {
        return var;
    }
}

class Child_84 extends Parent_84 {
    private int var = 2000; // Line n2

    int getVar() {
        return super.var; //Line n3
    }
}

public class Q84 {

    public static void main(String[] args) {
        Child_84 obj = new Child_84(); // Line n4
//        Parent_84 obj = new Child_84(); // Line n4
//        System.out.println(obj.var); // Line n5
        System.out.println(obj.getVar()); // Line n5
    }
}
