package algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Роман Лотоцький on 09.05.2017.
 */
public class EuclidTest {
    @Test
    public void findTheGreatestDevision() throws Exception {
        int result = Euclid.findTheGreatestDevision(8, 4);
        int result2 = Euclid.findTheGreatestDevision(15, 5);
        Assert.assertEquals(4, result);
        Assert.assertEquals(5, result2);
        Assert.assertNotEquals(4, result2);
    }

}