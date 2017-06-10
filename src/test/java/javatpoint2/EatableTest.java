package javatpoint2;

import org.junit.Test;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class EatableTest {

    @Test
    public void testEat(){
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Nice delicious fruit... :) ");
            }
        };
        eatable.eat();
    }

}