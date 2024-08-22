package org.example;

import java.util.*;

public class LC_Chicguk {
    ////Дан массив, заполненный уникальными значениями типа int,
    // необходимо найти элемент, который меньше максимума, но больше всех остальных.
    //public int preMax(int[] arr) {
    //}


    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 16, 32, 25, 6};
//       int[] arr = null;
        System.out.println(preMax(arr));


        String s = "LVII";
        System.out.println(romanToInt(s));

        String[] strs = {"полог", "поло", "половик"};
        System.out.println(longestCommonPrefix(strs));

        List<Integer> list = List.of(1,2,4);
        List<Integer> list2 = List.of(1,3,4);
        System.out.println(mergeList(list,list2));
    }

    public static int preMax1(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new RuntimeException();
        }
        int max = arr[0];
        int secondMax = arr[1];
        for (int e : arr) {
            if (e > max) {
                secondMax = max;
                max = e;
            } else if (e > secondMax && e < max) {
                secondMax = e;
            }
        }
        return secondMax;
    }

    public static int preMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new RuntimeException();
        }
        int max = arr[0];
        int secondMax = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    public static int[] toSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    //LVII
    public static int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int prevValue = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanToInt.get(s.charAt(i));
            // Если текущее значение меньше предыдущего, вычитаем его из общей суммы
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                // В противном случае добавляем его к общей сумме
                result += currValue;
            }
            // Обновляем значение предыдущего символа
            prevValue = currValue;
        }

        return result;
    }
//Напишите функцию для поиска самой длинной строки общего префикса среди массива строк.
//Если общего префикса нет, верните пустую строку "".

    public static String longestCommonPrefix(String[] strs) {
        // Проверка на пустой входной массив
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Инициализация переменной для хранения общего префикса
        String prefix = strs[0];

        // Проход по остальным строкам массива
        for (int i = 1; i < strs.length; i++) {
            // Пока текущая строка не начинается с текущего префикса, обрезаем префикс
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // Если префикс стал пустым, значит общего префикса нет, возвращаем ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // Возвращаем общий префикс
        return prefix;
    }

    public static List<Integer> mergeList(List<Integer> list, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list);
        result.addAll(list2);
        Collections.sort(result);
        return result;
    }

}
