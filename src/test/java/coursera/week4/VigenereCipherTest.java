package coursera.week4;

import edu.duke.FileResource;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 02.01.2017.
 */
public class VigenereCipherTest {

    @Test
    public void encrypt() throws Exception {
        int[] key = {17, 14, 12, 4};
        VigenereCipherr vc = new VigenereCipherr(key);
        FileResource fr = new FileResource("titus-small.txt");
        System.out.println(vc.encrypt(fr.asString()));
        System.out.println(vc.dencrypt(vc.encrypt(fr.asString())));
    }

}