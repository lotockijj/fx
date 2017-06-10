package javatpoint2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Роман Лотоцький on 14.05.2017.
 */
public class OuterTest {

   @Test
    public void testInner(){
       Outer obj = new Outer();
       Outer.Inner innerObject = obj.new Inner();
       innerObject.msg();
       Assert.assertEquals(30, innerObject.getData());
   }

}