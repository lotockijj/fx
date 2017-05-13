package sample;

/**
 * Created by Роман Лотоцький on 17.03.2017.
 */
public class Prometheus2 {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        boolean containsNumber = false;
        for(int i = 0; i < data.length; i++){
            if(data[i] == numberToFind){
                System.out.println(i);
                containsNumber = true;
            }
        }
        if(!containsNumber) {
            System.out.println(-1);
        }

        // PUT YOUR CODE HERE
    }

}