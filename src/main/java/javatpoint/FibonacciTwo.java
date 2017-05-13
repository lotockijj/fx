package javatpoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Роман Лотоцький on 05.05.2017.
 */
public class FibonacciTwo {
    static int rowsForRecusionTwo = 1;
    FibonacciTwo fibonacciTwo = new FibonacciTwo();

    private static void recursion(int rows, List<Integer> list) {
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < list.size() + 1; i++) {
            if(i == 0){
                listResult.add(1);
            }
            if(i < list.size() - 1) {
                listResult.add(list.get(i) + list.get(i + 1));
            }
            if(i == list.size()){
                listResult.add(1);
            }
        }
        if(listResult.size() == rows){
            return;
        }
        show(listResult);
        recursion(rows, listResult);
    }

    private static void show(List<Integer> listResult) {
        for (int i = 0; i < listResult.size(); i++) {
            System.out.print(listResult.get(i) + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        FibonacciTwo.recursion(10, list);
        System.out.println("Example from algorithms book (!?): ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  " + Fibonacci(i));
        }
        System.out.println("Example with varargs without using List: ");
        FibonacciTwo.recursion2(1, 2, 1);
    }

    public static long Fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return Fibonacci(N-1) + Fibonacci(N-2);
    }

    private static void recursion2(int... args) {
        for (int i = 0; i < args.length + 1; i++) {
            if(i == 0){
                System.out.print(1 + " ");
            }
            if(i < args.length - 1) {
                System.out.print(args[i] + args[i + 1] + " ");
            }
            if(i == args.length){
                System.out.print(1 + " ");
            }
        }
        System.out.println();
        rowsForRecusionTwo++;
        if(rowsForRecusionTwo == 10) return;
        recursion2(args);
    }

}
