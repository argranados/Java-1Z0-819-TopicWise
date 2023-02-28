package programflowoo;

public class Question2 {

    public static void main(String[] args) {
        int grade = 85;
        if(grade >= 60)
            System.out.println("Congratulations");
        System.out.println("You passed");       // ERROR solo toma en v=cuenta la linea 8, necesita llaves
//        else
        System.out.println("You failed");
    }
}
