package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class CallDirectlyRun extends Thread {

    public void run(){
        System.out.println("Running...");
        System.out.println("fine, but does not start a separate call stack  ");
    }

    public static void main(String[] args) {
        CallDirectlyRun t = new CallDirectlyRun();
        t.run();
    }
}
