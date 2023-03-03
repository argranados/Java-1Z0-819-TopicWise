package objectorientesapproach2;

class MyClass {
    MyClass() {
        System.out.println(101);
    }
}

class MySubClass extends MyClass {
    MySubClass() {
//    final MySubClass() {        //  final not allowed here
        System.out.println(202);
    }
}

public class Q59 {

    public static void main(String[] args) {
        System.out.println(new MySubClass());
    }
}
