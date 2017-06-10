package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class Join3 extends Thread{

    public void run(){
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Join3 t1 = new Join3();
        Join3 t2 = new Join3();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("id of t1: " + t1.getId());
        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("t1 after setName() is: " + t1.getName());
    }

}
