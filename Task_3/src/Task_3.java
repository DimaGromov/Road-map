/*
        Удалить из строки все вхождения введённого символа.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Введите строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите символ: ");
        char ch = scanner.next().charAt(0);

        String str2 = "" + ch;

        System.out.println(str1.replaceAll(str2, ""));
        */

        System.out.print("Введите строку: ");
        String str1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        System.out.print("Введите символ: ");
        char ch = scanner.next().charAt(0);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ch){
                sb.deleteCharAt(i);
            }
        }
        System.out.println("Изменённая строка: " + sb);
    }
}
