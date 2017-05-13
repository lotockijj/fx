package coursera.week44;

import coursera.week4.*;
import coursera.week4.CaesarCracker;
import edu.duke.FileResource;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 05.01.2017.
 */
public class CaesarCipherTest {

    @Test
    public void encryptLetter() throws Exception {
        FileResource fr = new FileResource("titus-small.txt");
        /*CaesarCracker ccr = new CaesarCracker();
        int key = ccr.getKey(fr.asString());*/
        CaesarCipher cc = new CaesarCipher(17);
        System.out.println(cc.encrypt(fr.asString()));
        System.out.println(cc.decrypt(fr.asString()));

    }

    @Test
    public void decryptLetter() throws Exception {

    }

    @Test
    public void encrypt() throws Exception {

    }

    @Test
    public void decrypt() throws Exception {

    }

}