package programflowoo;

class Message {
    public void printMessage() {
        System.out.println("Hello!");
    }
}

public class Question71 {

    public static void main(String[] args) {
        Message msg = new Message() {}; //Line n1
        msg.printMessage(); //Line n2
    }
}
