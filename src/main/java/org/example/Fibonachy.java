package org.example;

public class Fibonachy {
    public static void main(String[] args) {
        int n = 11; // Количество чисел Фибоначчи
        int[] fib = new int[n]; // Массив для хранения чисел Фибоначчи

        // Первые два числа в последовательности Фибоначчи
        fib[0] = 0;
        fib[1] = 1;

        // Вычисление остальных чисел
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Вывод чисел Фибоначчи
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
