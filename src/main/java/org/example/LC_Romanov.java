package org.example;

import java.util.Arrays;

public class LC_Romanov {
    // Проверить, что строка является изограммой (в строке НЕТ повторяющихся букв) (игнорировать регистр)
    //// Например: "Dermatoglyphics" --> true
    //// "aba" --> false
    //// "moOse" --> false (регистр нам не важен, тут две буквы О)
    //public static boolean isIsogram(String str) {
//
    //}


    //// Вычислить сумму только положительных чисел
    //  public static int sum(int[] arr){
    //
    //  }
    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moOse"));
    }

    //    public static boolean isIsogram(String str) {
//        Set<Character> set = new HashSet<>();
//        for (char ch : str.toLowerCase().toCharArray()) {
//            if (set.contains(ch)) {
//                return false;
//            }
//            set.add(ch);
//        }
//        return true;
//    }
    public static boolean isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
//        return i == str.length();
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(e -> e > 0).sum();
    }

    /*
Дан отсортированный по возрастанию массив целых чисел,
необходимо вернуть индексы двух чисел, сумма которых равна заданному числу.
Решить с помощью двух указателей. Нельзя использовать одно и то же число дважды.
Определить сложность решения.
Для примера: такой вызов должен вывести на экран [4, 8]:
System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 14)));
*/
    public static int[] twoSum(int[] sortedArray, int target) {
        int l = 0;
        int r = sortedArray.length - 1;

        while (l < r) {
            int sum = sortedArray[l] + sortedArray[r];
            if (sum == target) {
                return new int[]{l, r};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }

        }
        return null;
    }
}
