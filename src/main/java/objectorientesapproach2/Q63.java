package objectorientesapproach2;

class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }

}

class OTG extends PenDrive {
    String type;
    String make;
    OTG(int capacity, String type) {
        /*INSERT-1*/
        super(capacity);
        this.type = type;
    }
    OTG(String make) {
        /*INSERT-2*/
        super(0);
        this.make = make;
    }
}

public class Q63 {

    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
