package javatpoint;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 * Write a java program to sort an array elements using selection sort algorithm.
 */
public class SelectionSort {

    public int[] doSelectionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[index]){
                    index = j;
                }
                int smallerNumber = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallerNumber;
            }
        }
        return numbers;
    }

    public int[] doInsertionSort(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if(numbers[j] < numbers[j - 1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int numbers[] = {9, 8, 5, 6, 1, 7, 2, 4, 3};
        numbers = selectionSort.doSelectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

        System.out.println();
        int numbers2[] = {9, 8, 5, 3};
        numbers = selectionSort.doInsertionSort(numbers2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }
}
