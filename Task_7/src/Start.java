/*
        Напишите класс, конструктор которого принимает два массива:
            - массив значений;
            - массив весов значений.
        Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,
        с учетом его веса.
        Пример: дан массив [11, 22, 33], и массив весов [1, 2, 10]. В среднем, значение "11" должно возвращаться
        в 2 раза реже, чем значение "22" и в десять раз реже, чем значение "33".
 */

public class Start {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] mas = {2, 3, 4};

        Mass ms = new Mass(a, mas);

       for (int i=0; i<10; i++){
           System.out.println(ms.numRand());
       }
    }
}