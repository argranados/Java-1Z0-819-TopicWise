package objectorientesapproach2;

public class Q53 {

}

//immutable class
final class Greet {
    private String msg;
    public Greet(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
