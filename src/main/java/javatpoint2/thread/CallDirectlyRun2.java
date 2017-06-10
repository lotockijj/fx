package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class CallDirectlyRun2 {

    public void run(){

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
    }

    public static void main(String[] args) {
        CallDirectlyRun2 t = new CallDirectlyRun2();
        CallDirectlyRun2 t2 = new CallDirectlyRun2();
        t.run();
        t.run();
        System.out.println("When you call directly run() method insted of start\n" +
                "t1 and t2 will be treated as normal object not thread object.");
    }
}
