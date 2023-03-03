package objectorientesapproach2;

public class Q26 {

        public String color;
        public Q26(String color) {
            this.color = color;
        }

    public static void main(String[] args) {
        Q26 apple = new Q26("GREEN");
        System.out.println(apple.color);
    }
}
