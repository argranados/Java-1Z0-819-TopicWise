package programflowoo;

class A70 {
    public void print(String name) {
        class B70 {
            B70() {
                System.out.println(name); //Line n1
            }
        }
    }
//    B70 obj = new B70(); //Line n2   ERROR mp in scope
}

public class Question70 {

    public static void main(String[] args) {
        new A70().print("OCP"); //Line n3
    }
}
