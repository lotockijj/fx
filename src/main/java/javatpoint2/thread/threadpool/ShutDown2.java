package javatpoint2.thread.threadpool;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class ShutDown2 {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("shut down hook task completed..");
            }
        });
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
