package programflowoo;

class Message72 {
    public void printMessage() {
        System.out.println("Hello!");
    }
}

public class Question72 {

    public static void main(String[] args) {
        Message72 msg = new Message72() {}; //Line n1
        msg.printMessage(); //Line n2
    }
}
