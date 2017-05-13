package javatpoint;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to sort an array elements using bubble sort algorithm.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int numbers[] = {5, 8, 3, 2, 9, 1, 4, 7, 6};
        boolean fixed = false;
        int temp;
        while (fixed == false) {
            fixed = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    fixed = false;
                }
            }
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
