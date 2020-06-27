class TwoThread implements Runnable{
    private int i;
    public void run(){
        for(;i<20;i++){
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if(i == 20){
                System.out.println(Thread.currentThread().getName() + "\t" + "over");
            }
        }
    }
}



public class RunnableOne {
    public static void main(String[] args){
        for(int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            if (i == 5){
                TwoThread t1 = new TwoThread();
                Thread thread1 = new Thread(t1, "one");
                Thread thread2 = new Thread(t1, "two");
                thread1.start();
                thread2.start();
            }
        }
    }
}
