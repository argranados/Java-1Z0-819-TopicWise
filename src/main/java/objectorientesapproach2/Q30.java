package objectorientesapproach2;

class Person30 {
    String name;
    int age;

    Person30() {
//        Person30("Rohit", 25);    // calling method, use this to call constructor in same class
        this("Rohit", 25);
    }

    Person30(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q30 {

    public static void main(String[] args) {
        Person30 p = new Person30();
        System.out.println(p.name + ":" + p.age);
    }
}
