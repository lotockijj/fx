package algorithms;

/**
 * Created by Роман Лотоцький on 09.05.2017.
 */
public class ReverseArray {

    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }
}
