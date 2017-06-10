package javatpoint2.nestedinterface;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class TestNestedInterface1 implements Showable.Message {
    @Override
    public void msg() {
        System.out.println("Hello nested interface... :) ");
    }
}
