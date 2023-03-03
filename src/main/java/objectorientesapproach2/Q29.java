package objectorientesapproach2;

class Employee29 {
    String name;
    int age;

    Employee29() {
//        Employee29("Michael", 22); //Line n1    ERROR
        this("Michael", 22); //Line n1
    }

    Employee29(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q29 {

    public static void main(String[] args) {
        Employee29 emp = new Employee29();
        System.out.println(emp.name + ":" + emp.age); //Line n2
    }
}
