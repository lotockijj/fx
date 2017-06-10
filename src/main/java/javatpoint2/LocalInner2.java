package javatpoint2;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class LocalInner2 {
    private int data = 30;

    void display(){
        int value = 50;
        class Local{
            void msg(){
                System.out.println("Value is: " + value);
            }
        }
        Local local = new Local();
        local.msg();
    }
}
