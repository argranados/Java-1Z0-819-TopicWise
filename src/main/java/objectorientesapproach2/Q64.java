package objectorientesapproach2;

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
}

class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages
        /*INSERT-1*/
        this.type = type;
    }

    Word(int pages, String type) {
        /*INSERT-2*/
        this(type);
        super.pages = pages;
    }
}

public class Q64 {

    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(String.join(",", obj.type, obj.pages + ""));
    }
}
