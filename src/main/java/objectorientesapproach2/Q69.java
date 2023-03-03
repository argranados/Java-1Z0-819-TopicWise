package objectorientesapproach2;

class Vehicle69 {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car69 {   // error need to extend Vehicle69
    public double getRegistrationNumber() {     //error when attemtpting to override
//    public int getRegistrationNumber() {            // fix
        return 2;
    }
}

public class Q69 {

    public static void main(String[] args) {
//        Vehicle69 obj = new Car69();
//        System.out.println(obj.getRegistrationNumber());
    }
}
