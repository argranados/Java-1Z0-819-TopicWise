package objectorientesapproach2;

class Student9 {
    String name;
    int age;

    void Student9() {
        Student9("James", 25); //Line n1
    }

    void Student9(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q9 {
        public static void main(String[] args) {
            Student9 s = new Student9(); //Line n2
            System.out.println(s.name + ":" + s.age); //Line n3
        }
}
