package algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Роман Лотоцький on 09.05.2017.
 */
public class ReverseArrayTest {
    @Test
    public void reverseArray() throws Exception {
        int[] arr = {1, 2};
        int[] resultArray = ReverseArray.reverseArray(arr);
        Assert.assertEquals(2, resultArray[0]);
        int[] arr2 = {1, 2, 3};
        resultArray = ReverseArray.reverseArray(arr2);
        Assert.assertEquals(3, resultArray[0]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }

}