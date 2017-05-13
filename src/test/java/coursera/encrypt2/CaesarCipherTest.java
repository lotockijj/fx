package coursera.encrypt2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 03.01.2017.
 */
public class CaesarCipherTest {

    @Test
    public void encrypt() throws Exception {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("G YK", cc.encrypt("I AM", 24));
        assertEquals("I AM", cc.encrypt("G YK", 26 - 24));
        assertEquals("g yk", cc.encrypt("i am", 24));
        assertEquals("i am", cc.encrypt("g yk", 26 - 24));
        //task from coursera
        assertEquals("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!",
                cc.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        assertEquals("Cfopq Ibdflk", cc.encrypt("First Legion", 23));
        assertEquals("Wzijk Cvxzfe", cc.encrypt("First Legion", 17) );
    }

    @Test
    public void encryptTwoKeys(){
        CaesarCipher cc = new CaesarCipher();
        assertEquals("Czojq Ivdzle", cc.encryptTwoKeys("First Legion", 23, 17));
    }

    @Test
    public void halfOfString() throws Exception {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("aaa", cc.halfOfString("ababab", 0));
        assertEquals("bbb", cc.halfOfString("ababab", 1));
        // test from coursera:
        assertEquals("Qk gs", cc.halfOfString("Qbkm Zgis", 0));
        assertEquals("bmZi", cc.halfOfString("Qbkm Zgis", 1));
    }

    @Test
    public void decryptTwoKeys() throws Exception {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("mfeeeee", cc.decryptTwoKeys("absasas"));
    }

//    @Test
//    public void split(){
//        CaesarCipher cc = new CaesarCipher();
//        String[] resultSplit = cc.split("ababab");
//        assertEquals("aaa", resultSplit[0]);
//        assertEquals("bbb", resultSplit[1]);
//    }

}