package javatpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to check palindrome number.
 * Input: 329
 * Output: not palindrome number
 * Input: 12321
 * Output: palindrome number
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        while(true) {
            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            boolean isPalindromeNumber = checkIfNumberIsPalindrome(number);
            if (isPalindromeNumber) {
                System.out.println("The number is palindrome    :)");
            } else {
                System.out.println("The number isn't palindrome    :(");
            }
            if(number == 1){
                break;
            }
        }
    }

    private static boolean checkIfNumberIsPalindrome(int number) {
        List<Integer> list = createArrayListNumbers(number);
        boolean isTheSame = false;
        for(int i = 0, j = list.size() - 1; i < list.size(); i++ , j--){
            if (i == j) break;
            if(list.get(i) == list.get(j)){
                isTheSame = true;
            } else if(list.get(i) != list.get(j)){
                isTheSame = false;
                break;
            }
        }
        return isTheSame;
    }

    private static List<Integer> createArrayListNumbers(int number) {
        List<Integer> list = new ArrayList<>();
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            list.add(i, Character.getNumericValue(str.charAt(i)));
        }
        return list;
    }

}
