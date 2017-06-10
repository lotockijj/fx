package javatpoint2;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class Outer {

    private int data = 30;

    class Inner{
        void msg(){
            System.out.println("Data is: " + data);
        }
        int getData(){
            return data;
        }
    }

}
