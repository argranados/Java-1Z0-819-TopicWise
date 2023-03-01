package programflowoo;

class Logger {
    public void log() {
        System.out.println("GO FOR IT");
    }
}

public class Question74 {

    public static void main(String[] args) {
        Logger obj = new Logger() {
            public void Log() {
                System.out.println("LET IT BE");
            }
        };
        obj.log();
    }
}
