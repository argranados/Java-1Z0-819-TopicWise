package datatypes;

public class Question64 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hakuna"); //Line n3
        change(sb); //Line n4
        System.out.println(sb); //Line n5
    }

    private static void change(StringBuilder s) {
        s.append("_Matata"); //Line n9
    }

}
