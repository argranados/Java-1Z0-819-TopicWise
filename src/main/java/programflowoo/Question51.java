package programflowoo;

public class Question51 {

    public static void main(String[] args) {
        var style = new Style(); //Line n1
        System.out.println(style.pattern.repeat(5).length()); //Line n2

    }
}

class Style {
    String pattern = "*";
}