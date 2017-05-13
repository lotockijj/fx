package sample;

/**
 * Created by Роман Лотоцький on 17.03.2017.
 */
public class Prometheus {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("x2=" + x2);
        System.out.println("x1=" + x1);
        String [][] x ={{"*","2","3","4","*"},{"6","*","8","*","10"},{"11","12","*","14",
                "15"},{"16","*","18","*","20"},{"*","22","23","24","*"}};
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        boolean swapped = true;
        int z = 0;
        while (swapped){
            swapped = false;
            for (int i = 0; i < array.length - 1 - z; i++) {
                if (array[i] > array[i + 1]) {
                    int a1 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a1;
                    swapped = true;
                }
            }
            z++;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
