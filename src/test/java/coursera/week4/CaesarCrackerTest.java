package coursera.week4;

import org.junit.Test;
import edu.duke.FileResource;
import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 02.01.2017.
 */
public class CaesarCrackerTest {

    @Test
    public void getKey() throws Exception {
        FileResource fr = new FileResource("titus-small_key5.txt");
        CaesarCracker cc = new CaesarCracker();
        System.out.println(cc.getKey(fr.asString()));
        assertEquals(5, cc.getKey(fr.asString()));
        fr = new FileResource("oslusiadas_key17.txt");
        cc = new CaesarCracker('a');
        System.out.println(cc.getKey(fr.asString()));
        assertEquals(17 - 4, cc.getKey(fr.asString()));// portugies 'a' most common
    }

}