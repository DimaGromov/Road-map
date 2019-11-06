/*
        Поменять значения двух переменных.
 */

public class Task_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println("Переменная a равна " + a + ";");
        System.out.println("Переменная b равна " + b + ";");
        System.out.println();
        System.out.println("Замена");

        int c = a;
        a = b;
        b = c;
        System.out.println();
        System.out.println("Переменная a равна " + a + ";");
        System.out.println("Переменная b равна " + b + ";");
    }
}
