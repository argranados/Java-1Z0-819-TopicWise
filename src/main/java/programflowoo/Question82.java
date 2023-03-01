package programflowoo;

interface Logger82 {
    Object get();
    void log();
}

public class Question82 {
    private static void testLogger(Logger82 logger) {
        logger.log();
    }

    public static void main(String[] args) {
        var obj = new Logger82() { //Line n1
            @Override
            public Logger82 get() { //Line n2
                return this;
            }

            @Override
            public void log() {
                System.out.println("WINNERS NEVER QUIT"); //Line n3
            }
        };
        testLogger(obj.get()); //Line n4
    }
}
