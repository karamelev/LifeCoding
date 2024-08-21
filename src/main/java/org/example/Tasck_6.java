package org.example;

import java.util.Scanner;

public class Tasck_6 {
    public static void main(String[] args) {
//        Напишите класс, который принимает с клавиатуры два целых положительных числа: N и М (неизвестно, какое из введенных чисел больше).
//        Класс должен вывести на экран все целые числа между наименьшим и наибольшим значениями, введенными с клавиатуры.
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода двух целых чисел с клавиатуры
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        System.out.print("Введите целое число M: ");
        int m = scanner.nextInt();

        int min = Math.min(n, m);
        int max = Math.max(n, m);
        for (int i = min + 1; i < max; i++) {
            System.out.println(i);

        }
        scanner.close();

    }
}






























