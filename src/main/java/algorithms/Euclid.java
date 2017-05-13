package algorithms;

/**
 * Created by Роман Лотоцький on 09.05.2017.
 */
public class Euclid {

    public static int findTheGreatestDevision(int p, int q){
        if(q == 0) return p;
        int r = p%q;
        return findTheGreatestDevision(q, r);

    }
}
