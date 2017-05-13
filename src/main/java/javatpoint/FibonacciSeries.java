package javatpoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to print fibonacci series without using
 * recursion and using recursion.
 * Input: 10
 * Output: 0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int j = 0;
        int k = 1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(j);
        list.add(k);
        for (int i = 0; i < 8; i++) {
            list.add(list.get(list.size()-1) + list.get(list.size() - 2));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
