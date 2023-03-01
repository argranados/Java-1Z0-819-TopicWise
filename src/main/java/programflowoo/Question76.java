package programflowoo;

class Season {
    public void printCurrentSeason() {
        System.out.println("SUMMER");
    }
}

public class Question76 {

    public static void main(String[] args) {
        var season = new Season() { //Line n1
//            @Override public void PrintCurrentSeason() { //Line n2
            public void printCurrentSeason() { //Line n2   REMOVE OVERRIDE - method name is different
                System.out.println("WINTER");
            }
        };
        season.printCurrentSeason(); //Line n3
//        season.PrintCurrentSeason(); //Line n3
    }
}
