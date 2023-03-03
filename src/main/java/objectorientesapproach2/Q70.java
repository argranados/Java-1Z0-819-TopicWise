package objectorientesapproach2;

public class Q70 {}

abstract class Helper {
    int num = 100;
    String operation = null;

//    protected abstract void help();           // error
    abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {                             // error
//    protected void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}
