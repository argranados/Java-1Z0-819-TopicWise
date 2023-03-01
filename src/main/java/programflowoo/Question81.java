package programflowoo;

interface Sellable {
    double getPrice();
}

public class Question81 {

        private static void printPrice(Sellable sellable) {
            System.out.println(sellable.getPrice());
        }

        public static void main(String[] args) {
            printPrice(new Sellable() {
                @Override
                public double getPrice() {
                    return 45.34;
                }
            });

        }
}
