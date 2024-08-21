package org.example;

public class task_array {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 3;
        System.out.println(canPlaceFlowers(flowerbed,n));


    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Помечаем текущий участок как занятый
                count++; // Увеличиваем счетчик посаженных цветов
            }
            i++;
        }

        return count >= n; // Возвращаем true, если количество посаженных цветов больше или равно n
    }
}
