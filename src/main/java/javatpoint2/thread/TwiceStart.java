package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class TwiceStart extends Thread{

    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        TwiceStart t = new TwiceStart();
        t.start();
        try {
            t.start();
        } catch (IllegalThreadStateException e){
            System.out.println(e);
        }
    }
}
