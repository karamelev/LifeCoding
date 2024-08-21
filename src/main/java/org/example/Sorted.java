package org.example;

import java.util.*;

public class Sorted {
    public static void main(String[] args) {

        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
        System.out.println(Arrays.toString(new int[]{distinct(sortedList)}));

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = binarySearch(nums, target);
        System.out.println(index);

        List<String> lines = List.of("a", "b", "c");
        System.out.println(number(lines));


    }

    public static int distinct(int[] sortedList) {
        Set<Integer> list = new LinkedHashSet<>();
        for (int e : sortedList) {
            list.add(e);
        }
// преобразование Set в int[] array
        int[] intArray = new int[list.size()];

        int index = 0;
        for (Integer num : list) {
            intArray[index++] = num;
        }

        return intArray.length;
    }

    public static int distinct2(int[] sortedList) {
        return (int) Arrays.stream(sortedList).distinct().count();

    }

    //Бинарный поиск - дан отсортированный по возрастанию массив чисел, вернуть индекс искомого числа или -1, если этого числа нет.
    //Пример:
    //Input: nums = [-1,0,3,5,9,12], target = 9    Output: 4 (индекс)
    //int[] nums = new int[]{-1,0,3,5,9,12};
    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Найден целевой элемент, возвращаем его индекс
            } else if (nums[mid] < target) {
                left = mid + 1; // Целевой элемент больше среднего, ищем в правой половине
            } else {
                right = mid - 1; // Целевой элемент меньше среднего, ищем в левой половине
            }
        }

        return -1; // Элемент не найден
    }
    //Пронумеровать элементы массива - каждому задать его порядковый номер, начиная с 1.
    //// Пример:
    //// [] --> []
    //// ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            list.add((i+1)+":"+lines.get(i));
        }
        return list;
    }
}
