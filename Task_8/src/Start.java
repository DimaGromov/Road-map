/*
        Заполните массив случайными числамии выведите максимальное, минимальное и среднее значение.
 */

public class Start {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Mass ms = new Mass(arr);
        ms.printMs();
        ms.maxNum();
        ms.minNum();
        ms.srNum();

    }
}
