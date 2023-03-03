package objectorientesapproach2;

public class Q71 {

    public static void main(String[] args) {

    }
}

abstract class Food {
    abstract double getCalories();
}

class JunkFood extends Food {
    double getCalories() {
        return 200.0;
    }
}