package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class Join2 extends Thread{
    public void run(){
        for (int i = 0; i <= 5; i++) {
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Join2 t1 = new Join2();
        Join2 t2 = new Join2();
        Join2 t3 = new Join2();
        t1.start();
        try{
            t1.join(1500);
        } catch (InterruptedException e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }

}
