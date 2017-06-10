package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class TestDaemonThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();
        t1.start();
        System.out.println("Note: If you want to make a user thread as Daemon," +
                " it must not be started otherwise " +
                "it will throw IllegalThreadStateException.");
        t1.setDaemon(true);
        t2.start();
    }
}
