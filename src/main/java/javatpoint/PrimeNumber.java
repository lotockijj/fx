package javatpoint;

import java.util.Scanner;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to check prime number.
 * Input: 44
 * output: not prime number
 * Input: 7
 * Output: prime number
 */
public class PrimeNumber {

    public static void main(String args[]) {
        while (true) {
            int m = 0, flag = 0;
            System.out.println("Write number: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            m = n / 2;
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Number is prime      :) ");
            if(n == 1){
                break;
            }
        }
    }
}
