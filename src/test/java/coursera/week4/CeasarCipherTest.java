package coursera.week4;

import edu.duke.FileResource;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 02.01.2017.
 */
public class CeasarCipherTest {

    @Test
    public void encryptLetter() throws Exception {
        CeasarCipher cc = new CeasarCipher(22);
        //System.out.println(cc.encryptLetter("c"));
        assertEquals("y", cc.encryptLetter("c"));
        FileResource fr = new FileResource("titus-small.txt");
    }

    @Test
    public void dencryptLetter() throws Exception {
        CeasarCipher cc = new CeasarCipher(22);
        //System.out.println(cc.dencryptLetter("y"));
        FileResource fr = new FileResource("titus-small.txt");
        assertEquals("c", cc.dencryptLetter("y"));
    }

}