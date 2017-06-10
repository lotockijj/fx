package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class JoinName extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        JoinName t1 = new JoinName();
        JoinName t2 = new JoinName();
        t1.start();
        t2.start();
    }
}
