package javatpoint2;

import org.junit.Test;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class PersonTest {

    @Test
    public void testEat(){
        Person person = new Person(){
            @Override
            void eat() {
                System.out.println("Nice fruit... ");
            }
        };
        person.eat();
    }

}