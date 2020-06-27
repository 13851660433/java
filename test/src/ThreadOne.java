
class Lefthand extends Thread{
    public void run(){
        for(int i=0;i <= 5; i++){
            System.out.println("I am Lefthand");
            try{
                sleep(500);
            }catch(InterruptedException e){}
        }
    }
}

class Righthand extends Thread{
    public void run(){
        for(int i=0; i<= 5; i++){
            System.out.println("I am Righthand");
            try{
                sleep(300);
            }catch(InterruptedException e){}
        }
    }
}



public class ThreadOne {
    static Lefthand left;
    static  Righthand right;
    public static void main(String[] args){
        left = new Lefthand();
        right = new Righthand();
        left.start();
        right.start();
    }
}
