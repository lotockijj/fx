package algorithms;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Роман Лотоцький on 10.05.2017.
 */
public class Chapter1 {

    public static void main(String[] args) {
        // Task first
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        // second
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        // third
        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        // fourth
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
        System.out.println((char) ('a' + 5));

        //fifth
        System.out.println("Write a code fragment that puts " +
                "the binary representation of a positive integer N" +
                "into a String s.");
        System.out.println("Result from 111: " + Integer.toBinaryString(111));
        System.out.println("Result from 128: " + Integer.toBinaryString(128));
        System.out.println("One more concise method: ");
        System.out.println("for(int n = N; n > 0; n /= 2) s = (n%2) + s");
        String s = "";
        for (int n = 111; n > 0; n /=2) {
            s = (n%2) + s;
        }
        System.out.println("Result for 111 is: " + s);
        s = "";
        for (int n = 128; n > 0; n /=2) {
            s = (n%2) + s;
        }
        System.out.println("Result for 128 is: " + s);

        /**Write a code fragment that prints the contents of a two-dimensional
         * boolean array, using * to represent true and a space to
         * represent false. Include row and column numbers
         */
        Boolean[][] twoDimArray = new Boolean[10][7];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if(i%2 == 0){
                    twoDimArray[i][j] = true;
                } else {
                    twoDimArray[i][j] = false;
                }
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if(twoDimArray[i][j] == true){
                    System.out.print(i + "*" + j + "  ");
                } else{
                    System.out.print(i + "-" + j + "  ");
                }
            }
            System.out.println();
        }
        System.out.println("RESULT: ");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        System.out.println("Task 1.1.13: *************");
        int[][] twoDA = new int[3][3];
        for (int i = 0; i < twoDA.length; i++) {
            for (int j = 0; j < twoDA[i].length; j++) {
                if(i == 0 || i == 1){
                    twoDA[i][j] = i + j;
                } else {
                    twoDA[i][i] = i * j;
                }
            }
        }
        System.out.println("Result before is: ");
        for (int i = 0; i < twoDA.length; i++) {
            for (int j = 0; j < twoDA[i].length; j++) {
                System.out.print(twoDA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After: ");
        int[][] twoDA2 = new int[twoDA.length][twoDA.length];
        for (int i = 0; i < twoDA.length; i++) {
            for (int j = 0; j < twoDA[i].length; j++) {
                twoDA2[i][j] = twoDA[j][i];
            }
        }
        for (int i = 0; i < twoDA2.length; i++) {
            for (int j = 0; j < twoDA2[i].length; j++) {
                System.out.print(twoDA2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1.1.16 Give the value of exR1(6):");
        System.out.println("exR1(2) = " + exR1(2));
        System.out.println("exR1(3) = " + exR1(3));
        System.out.println("exR1(4) = " + exR1(4));
        System.out.println("exR1(5) = " + exR1(5));
        System.out.println("exR1(6) = " + exR1(6));

        System.out.println("1.1.18 Consider the following recursive function:");
        System.out.println("mystery(2, 25) = " + mystery(2, 25));
        System.out.println("mystery(3, 11) = " + mystery(3, 11));
        System.out.println("mystery(5, 11) = " + mystery(5, 11));
        System.out.println("mystery2(2, 25) = " + mystery2(2, 25));
        System.out.println("mystery2(3, 11) = " + mystery2(3, 11));
        System.out.println("mystery2(5, 11) = " + mystery2(5, 11));

        System.out.println("1.1.19 *********");
        for (int N = 0; N < 10; N++) {
            StdOut.println(N + " " + Fibonacci(N));
        }
        System.out.println("1.1.20 Write a recursive " +
                "static method that computes the value of ln (N !)");
        System.out.println(factorial(4));


    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a+a, b/2);
        return mystery2(a+a, b/2) + a;
    }

    public static long Fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return Fibonacci(N-1) + Fibonacci(N-2);
    }
//    public static double computeValueLnFactorial(double N){
//        return computeValueLnFactorial(Math.log(factorial(N)));
//    }

    private static int factorial(int N){
        if(N == 1) return 1;
        return factorial(N - 1) * N;
    }
}
