package objectorientesapproach2;

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}

class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}

class DigitalPadlock extends Padlock {
    public void open() {
        System.out.println("no se");
    }
}

public class Q92 {

    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }
}
