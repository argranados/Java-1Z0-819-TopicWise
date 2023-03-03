package objectorientesapproach2;

public class Q43 {

    public static void main(String[] args) {
        double price = 90000;
//        String model;     // not initialized
        String model="";
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        System.out.println(model);
    }
}
