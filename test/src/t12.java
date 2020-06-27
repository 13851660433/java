import javax.swing.*;

interface t121 {
    void Per();
    void frid();
}

class tong implements t121{
    public void Per(){
        System.out.println("Per");
    }
    public void frid(){
        System.out.println("frid");
    }
        }

public class t12{
    public static void main(String[] args){
        tong th = new tong();
        th.frid();
        th.Per();
    }

}
