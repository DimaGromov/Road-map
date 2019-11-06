/*
        Узнать, какое число продублировано в массиве, размером N,
        где есть числа от 1 до (N-1).
 */

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int N = 10;
        int [] arr = {3, 8, 7, 2, 7, 4, 5, 9, 1, 6};
        int sum_N=0;
        int sum=0;
        for (int i = 1; i <N ; i++) {
            sum+=i;
        }
        for (int i:arr) {
            sum_N+=i;
        }
        System.out.println("Повторяющееся число: " + (sum_N-sum));

    }
}
