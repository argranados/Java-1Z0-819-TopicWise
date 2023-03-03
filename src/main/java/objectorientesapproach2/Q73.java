package objectorientesapproach2;

abstract class Log {
    abstract long count(); //Line n1
    abstract Object get(); //Line n2
}

class CommunicationLog extends Log {
//    int count() { //Line n3         //error
    long count() { //Line n3            //fix
        return 100;
    }

    String get() { //Line n4
        return "COM-LOG";
    }
}

public class Q73 {

    public static void main(String[] args) {
        Log log = new CommunicationLog(); //Line n5
        System.out.print(log.count());
        System.out.print(log.get());
    }
}
