package javatpoint;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * An Armstrong number of three digits is an integer
 * such that the sum of the cubes of its digits
 * is equal to the number itself.
 * For example, 371 is an Armstrong number since
 * 3**3 + 7**3 + 1**3 = 371.
 * Write a program to find all Armstrong number in the range of 0 and 999.
 */
public class AmstrongNumber {

    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            int power = Integer.toString(i).length();
            List<Integer> list = createList(i);
            if(i == getAmstrongNumber(list, power)){
                resultList.add(i);
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + "  ");
        }
    }

    private static int getAmstrongNumber(List<Integer> list, int power) {
        int amstrongNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            amstrongNumber += pow(list.get(i), power);
        }
        return amstrongNumber;
    }

    private static List<Integer> createList(int i) {
        List<Integer> list = new ArrayList<>();
        String str = Integer.toString(i);
        for (int j = 0; j < str.length(); j++) {
            list.add(Character.getNumericValue(str.charAt(j)));
        }
        return list;
    }
}
