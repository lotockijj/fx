package coursera.week3;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 29.12.2016.
 */
public class LogAnalyzerTest {

    @org.junit.Test
    public void countUniqueIPs() throws Exception{
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        int countUnique = la.countUniqueIPs();
        //System.out.println("Count unique IPs: " + countUnique);
        assertEquals(45, countUnique);
    }

    @org.junit.Test
    public void uniqueIPVisitsOneDay(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println("What size is the ArrayList that is returned: "
        //        + la.uniqueIPVisitsOneDay("Sep 27").size());
        assertEquals(8, la.uniqueIPVisitsOneDay("Sep 27").size());

    }

    @org.junit.Test
    public void countUniqueIPsInRange(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println(la.countUniqueIPsInRange(200, 299));
        assertEquals(40, la.countUniqueIPsInRange(200, 299));
    }
    @org.junit.Test
    public void countVisitsPerIP () throws Exception {
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("short-test_log");
        HashMap<String, Integer> counts;
        counts = la.countVisitsPerIP();

        assertEquals(counts.size(), 4);
        assertTrue("contains 157.55.39.203", counts.containsKey("157.55.39.203"));
        assertTrue("Contains ip 157.55.39.203 once", counts.get("157.55.39.203") == 1);
        assertTrue("Contains ip 152.3.135.44", counts.get("152.3.135.44") == 3);
    }

    @org.junit.Test
    public void iPsMostVisits() throws Exception{
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");
        HashMap<String, Integer> counts = la.countVisitsPerIP();
        ArrayList<String> mostVisits = la.iPsMostVisits(counts);
        //System.out.println("most visits: " + mostVisits); //84.190.182.222
        assertEquals(mostVisits.size(), 1);
    }

    @org.junit.Test
    public void iPsMostVisits2() throws Exception{
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println(la.iPsMostVisits(la.countVisitsPerIP()));
        assertEquals("[188.162.84.63]", la.iPsMostVisits(la.countVisitsPerIP()).toString());
    }

    @org.junit.Test
    public void mostNumberVisitsByIP(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");
        HashMap<String, Integer> counts = la.countVisitsPerIP();
        //System.out.println(la.mostNumberVisitsByIP(counts)); //133
        assertEquals( 133, la.mostNumberVisitsByIP(counts));
    }

    @org.junit.Test
    public void mostNumberVisitsByIP2(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println(la.mostNumberVisitsByIP(la.countVisitsPerIP()));
        assertEquals(63, la.mostNumberVisitsByIP(la.countVisitsPerIP()));
    }

    @org.junit.Test
    public void iPsForDays(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");

        HashMap<String, ArrayList<String>> ipForDay = la.iPsForDays();
        //System.out.println(ipForDay);
        assertTrue(ipForDay.containsKey("24 Mar"));
        assertEquals(ipForDay.get("24 Mar").size(), 225);
        assertEquals(ipForDay.size(), 10);
    }

    @org.junit.Test
    public void dayWithMostIPVisits(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");
        String seachingDay = la.dayWithMostIPVisits();
        //System.out.println(seachingDay);
        assertEquals(seachingDay, "24 Mar");
    }

    @org.junit.Test
    public void dayWithMostIPVisits2(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println(la.dayWithMostIPVisits());
        assertEquals("24 Sep", la.dayWithMostIPVisits());
    }

    @org.junit.Test
    public void iPsWithMostVisitsOnDay(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");
        ArrayList<String> mostVisitsOnDay = la.iPsWithMostVisitsOnDay("17 Mar");
        //System.out.println(mostVisitsOnDay);
        assertEquals(1, mostVisitsOnDay.size());
    }

    @org.junit.Test
    public void iPsWithMostVisitsOnDay2(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        //System.out.println(la.iPsWithMostVisitsOnDay("30 Sep"));
        assertEquals(2, la.iPsWithMostVisitsOnDay("30 Sep").size());
    }

}