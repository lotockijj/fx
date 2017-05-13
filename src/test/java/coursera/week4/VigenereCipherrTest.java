package coursera.week4;

import edu.duke.FileResource;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 05.01.2017.
 */
public class VigenereCipherrTest {

    @Test
    public void encrypt() throws Exception {
        FileResource fr = new FileResource("titus-small.txt");
        int[] keys =  {17, 14, 12, 4}; // word "rome"
        VigenereCipherr vc = new VigenereCipherr(keys);
        System.out.println(vc.encrypt(fr.asString()));
        System.out.println("*******************************");
        System.out.println(vc.dencrypt(vc.encrypt(fr.asString())));


    }

    @Test
    public void dencrypt() throws Exception {

    }

}