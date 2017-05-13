package javatpoint;

import java.util.Scanner;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to print factorial of a number.
 * Input: 5
 * Output: 120
 * Input: 6
 * Output: 720
 */
public class FactorialNumber {

    public static void main(String[] args) {
        while (true){
            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int result = 1;
            for(int i = 1; i <= number; i++){
                result *= i;
            }
            System.out.println("Factorial of " + number + " is: " + result);
            if(number == 1){
                break;
            }
        }
    }
}
