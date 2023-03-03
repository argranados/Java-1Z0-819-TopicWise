package objectorientesapproach2;

class Parent_89 {
    String quote = "MONEY DOESN'T GROW ON TREES";
}

class Child_89 extends Parent_89 {
    String quote = "LIVE LIFE KING SIZE";
}

class GrandChild_89 extends Child_89 {
    String quote = "PLAY PLAY PLAY";
}

public class Q89 {

    public static void main(String[] args) {
        GrandChild_89 gc = new GrandChild_89();
        System.out.println(((Parent_89)(Child_89)gc).quote);
    }
}
