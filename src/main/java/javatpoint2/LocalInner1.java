package javatpoint2;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class LocalInner1 {
    private int data = 30;

    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local local = new Local();
        local.msg();
    }

}
