package javatpoint2.thread;

/**
 * Created by Роман Лотоцький on 16.05.2017.
 */
public class SimpleExercise extends Thread{

    public void run(){
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i + ",  ");
        }
    }

    public static void main(String[] args) {
        SimpleExercise simpleExercise = new SimpleExercise();
        simpleExercise.start();
        SimpleExercise simpleExercise2 = new SimpleExercise();
        simpleExercise2.start();
    }

}
