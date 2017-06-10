package javatpoint2.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String s){
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " (Start)message " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End) ");

    }

    private void processMessage() {
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10 ; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("Finished all threads");
    }
}
