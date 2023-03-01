package programflowoo;

public class Question46 {

    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }
    }
}
// 10 11 12     33
// 10 12 10