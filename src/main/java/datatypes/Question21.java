package datatypes;

public class Question21 {

    public static void main(String[] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
    }
}

class A {
    public String toString() {
        return null;
    }
}

