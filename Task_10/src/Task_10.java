/*
        Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
 */

public class Task_10 {
    public static void main(String[] args) {
        int counter;
        for (int i = 2; i <=100 ; i++) {
            counter = 0;
            for (int j = 1; j <=i ; j++) {
                if(i%j == 0){
                    counter++;
                }
            }
            if(counter == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
