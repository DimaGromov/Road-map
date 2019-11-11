/*
        Реализуйте алгоритм, сортровки пузырьком.
 */

import java.util.Arrays;

public class Task_9_Buble_sort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 7, 3, 15, 85, 47, 12};
        System.out.println(Arrays.toString(arr));
        Buble_sort.bSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
