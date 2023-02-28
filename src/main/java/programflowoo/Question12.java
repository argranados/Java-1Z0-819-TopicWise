package programflowoo;

public class Question12 {

    public static void main(String[] args) {
        String sport = "swimming";
        switch (sport) {
            default:
                System.out.println("RUNNING");
            case "Tennis":
                System.out.println("TENNIS");
            case "Swimming":
                System.out.println("SWIMMING");
            case "Football":
                System.out.println("FOOTBALL");
                break;
        }
    }
}
