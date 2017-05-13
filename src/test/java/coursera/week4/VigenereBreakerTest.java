package coursera.week4;

import coursera.week44.VigenereCipher;
import edu.duke.FileResource;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 03.01.2017.
 */
public class VigenereBreakerTest {
    @Test
    public void breakForLanguage() throws Exception {
        VigenereBreaker vb = new VigenereBreaker();
        FileResource fr = new FileResource("secretmessage1.txt");
        System.out.println(vb.breakForLanguage(fr.asString()));
    }

    @Test
    public void countWords() throws Exception {
        VigenereBreaker vb = new VigenereBreaker();
        assertEquals(3, vb.countWords("The as at"));
        assertEquals(4, vb.countWords("That, by, Is, on"));
    }

    @Test
    public void sliceString() throws Exception {
        VigenereBreaker vb = new VigenereBreaker();
        assertEquals("adgjm", vb.sliceString("abcdefghijklm", 0, 3));
        assertEquals("behk", vb.sliceString("abcdefghijklm", 1, 3));
        assertEquals("cfil", vb.sliceString("abcdefghijklm", 2, 3));
        assertEquals("aeim", vb.sliceString("abcdefghijklm", 0, 4) );
        assertEquals("bfj", vb.sliceString("abcdefghijklm", 1, 4));
        assertEquals("cgk", vb.sliceString("abcdefghijklm", 2, 4));
        assertEquals("dhl", vb.sliceString("abcdefghijklm", 3, 4));
        assertEquals("afk", vb.sliceString("abcdefghijklm", 0, 5));
        assertEquals("bgl", vb.sliceString("abcdefghijklm", 1, 5));
        assertEquals("chm", vb.sliceString("abcdefghijklm", 2, 5));
        assertEquals("di", vb.sliceString("abcdefghijklm", 3, 5));
        assertEquals("ej",vb.sliceString("abcdefghijklm", 4, 5));
    }

    @Test
    public void tryKeyLength(){
        VigenereBreaker vb = new VigenereBreaker();
        FileResource fr = new FileResource("athens_keyflute.txt");
        int[] m = vb.tryKeyLength(fr.asString(), 5, 'e');
        for (int i = 0; i < m.length; i++) {
           // System.out.println(m[i]);
        }
        VigenereCipher vc = new VigenereCipher(m);
        //System.out.println(vc.decrypt(fr.asString())); //work good!!! :)
    }

    @Test
    public void tryKeyLength2(){
        VigenereBreaker vb = new VigenereBreaker();
        FileResource fr = new FileResource("secretmessage1.txt");
        int[] m = vb.tryKeyLength(fr.asString(), 4, 'e');
        for (int i = 0; i < m.length; i++) {
           // System.out.print(m[i] + "  ");
        }
        VigenereCipher vc = new VigenereCipher(m);
        //System.out.println(vc.decrypt(fr.asString()));
    }

}