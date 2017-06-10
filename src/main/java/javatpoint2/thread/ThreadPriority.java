package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class ThreadPriority extends Thread {

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread priority: "
                + ThreadPriority.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
