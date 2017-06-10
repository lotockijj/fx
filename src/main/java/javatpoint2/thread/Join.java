package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class Join extends Thread{

    public void run(){
        for (int i = 0; i < 3; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Join t1 = new Join();
        Join t2 = new Join();
        Join t3 = new Join();

        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }

}
