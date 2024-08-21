package org.example;

import java.util.*;

public class Task_Collection {
    public static void main(String[] args) {
        //Вывести количество уникальных символов во всём массиве строк
        //Например: ["ABC", "DEF", "ADL", "PLA"]  -> 8
        String[] strings1 = {"ABC", "DEF", "ADL", "PLA"};
        System.out.println(uniqueCharacters(strings1)); // Output: 8


        //Создать коллекцию целых чисел, написать метод,
        //который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
        List<Integer> list = List.of(1, 5, -3, 7);
        System.out.println(positiveCollection(list));

        //найти первый уникальный элемент массива
        int[] arr = {9, 4, 9, -1, 0, 6, 7, 4, 5, -1, 0};
        System.out.println(FirstUnicumElement(arr));

        // отсортированны и уникальны вернуть новый лист с уникальнми элементами для обоих массивов
        int[] a = {2, 4, 5, 7, 8, 10, 12, 15};
        int[] b = {5, 8, 11, 12, 14, 15};
        System.out.println(getSymmetricDifference(a,b));


        /// Учитывая целочисленный массив nums, возвращайте значение true,
        //если какое-либо значение встречается в массиве хотя бы дважды,
        //и возвращайте значение false, если каждый элемент различен.
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); //true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); //false
    }

    public static int uniqueCharacters(String[] strings) {
        Set<String> uniqueChars = new HashSet<>();
        for (String str : strings) {
            for (char ch : str.toCharArray()) {
                uniqueChars.add(String.valueOf(ch));
            }
        }

        return uniqueChars.size();
    }

    public static List<Integer> positiveCollection(List<Integer> list1) {
        List<Integer> list = new ArrayList<>();
        for (Integer e : list1) {
            if (e < 0) {
                list.add(e * (-1));
            } else {
                list.add(e);
            }

        }
        return list;

    }

// Найти первый уникальный элемент массива

    public static int FirstUnicumElement(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }
    public static List<Integer> getSymmetricDifference(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            list.add(a[i]);
            i++;
        }
        while (j < m) {
            list.add(b[j]);
            j++;
        }
        return list;

    }

// Учитывая целочисленный массив nums, возвращайте значение true,
//если какое-либо значение встречается в массиве хотя бы дважды,
//и возвращайте значение false, если каждый элемент различен.

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer e : nums) {
            if (!set.add(e)) {
                return true;
            }
        }
        return false;
    }




}
