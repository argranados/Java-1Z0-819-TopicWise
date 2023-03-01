package programflowoo;

class Outer87 {
    abstract static class Animal { //Line n1
        abstract void eat();
    }

    static class Dog extends Animal { //Line n2
        void eat() { //Line n3
            System.out.println("DOG EATS BISCUITS");
        }
    }
}

public class Question87 {

    public static void main(String[] args) {
        Outer87.Animal animal = new Outer87.Dog(); //Line n4
        animal.eat();
    }
}
