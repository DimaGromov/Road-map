/*
        Дан массив целых чисел и еще одно целое число. Удалите все вхождения числа из массива (пропусков быть не должно).
 */

import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int num = 0;

        System.out.println(Arrays.toString(arr));

        // Посчитаем количество вхождений.
        int counter = 0;
        for (int j : arr) {
            if (j == num) {
                counter++;
            }
        }

        // Новый массив.
        int size = arr.length-counter;
        int[] newArr = new int[size];
        counter = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] != num) {
                newArr[counter] = arr[i];
                counter++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
