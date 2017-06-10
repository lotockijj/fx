package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class TestDaemonThread1 extends Thread {

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work!");
        } else {
            System.out.println("User thread work...");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();
        TestDaemonThread1 t2 = new TestDaemonThread1();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
