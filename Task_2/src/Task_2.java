/*
        Поменять значения двух переменных без использования третьей.
 */

public class Task_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Значение переменной a равно " + a + ";");
        System.out.println("Значение переменной b равно " + b + ";");

        a = a + b; // a = 5 + 10 = 15
        b = a - b; // b = 15 - 10 = 5
        a = a - b; // a = 15 - 5 = 10

        System.out.println("\nЗамена.\n");
        System.out.println("Значение переменной a равно " + a + ";");
        System.out.println("Значение переменной b равно " + b + ";");
    }
}
