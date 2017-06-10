package javatpoint2.thread.threadpool;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class ShutDownHookDemo extends Thread {

    @Override
    public void run() {
        System.out.println("shut down hook task completed..");
    }

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHookDemo());

        System.out.println("Now main sleeping... press CTRL + C to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
