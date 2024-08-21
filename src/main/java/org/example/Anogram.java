package org.example;

import java.util.*;

public class Anogram {
    //Если две строки являются анаграммами, то после сортировки они будут одинаковыми.

    public static void main(String[] args) {
        //Учитывая две строки s и t, верните, true если t является анаграммой s, и false в противном случае .
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false

       String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    //Учитывая две строки s и t, верните, true если t является анаграммой s, и false в противном случае .
    public  static boolean isAnagram(String s, String t) {
        // Если длины строк разные, они не могут быть анаграммами
        if (s.length() != t.length()) {
            return false;
        }

        // Преобразуем строки в массивы символов
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Сортируем массивы символов
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Сравниваем отсортированные массивы
        return Arrays.equals(sArray, tArray);
    }

    // при помощи Map
    public boolean isAnagram2(String s, String t) {
        // Если длины строк разные, они не могут быть анаграммами
        if (s.length() != t.length()) {
            return false;
        }

        // Используем хэш-таблицы для подсчета частоты символов
        Map<Character, Integer> countMapS = new HashMap<>();
        Map<Character, Integer> countMapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMapS.put(c, countMapS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            countMapT.put(c, countMapT.getOrDefault(c, 0) + 1);
        }

        // Сравниваем хэш-таблицы
        return countMapS.equals(countMapT);
    }
 // с использованием одного массива
    public boolean isAnagram3(String s, String t) {
        // Если длины строк разные, они не могут быть анаграммами
        if (s.length() != t.length()) {
            return false;
        }

        // Используем массив для подсчета частоты символов
        int[] count = new int[26]; // Допустим, строки содержат только буквы латинского алфавита

        // Подсчитываем символы из первой строки и уменьшаем счетчики для второй строки
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Проверяем, что все счетчики равны нулю
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    //Сгруппировать анаграмы
    //Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    //
    //Input: strs = [""]
    //Output: [[""]]
    //
    //Input: strs = ["a"]
    //Output: [["a"]]
    //*/
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.copyValueOf(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
