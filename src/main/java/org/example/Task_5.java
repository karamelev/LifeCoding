package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_5 {
    //Развернуть произвольную строку без использования методов типа reverse() и split() и при этом используя один массив
    public static void main(String[] args) {

//        char[] chars = "Повернуть строку".toCharArray();
//        System.out.println(reversString(chars));
//        String originalString = "Hello, world!";
//        String reversedString = reverseString(originalString);
//        System.out.println("Original string: " + originalString);
//        System.out.println("Reversed string: " + reversedString);

        //Реализовать метод,
        // который будет возвращать количество передаваемого символа в слове.
//        System.out.println(countCharAtWord('v', "Java"));
//        String str = " Java";

        //Реализуй метод, который поменяет ключи и значения в HashMap местами
        ////На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
//        Map<Integer,String>map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2,"two");
//        for (Map.Entry <> entry : map.) {
//
//        }
        //Создать коллекцию целых чисел, написать метод,
        //который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
        List<Integer> list1 = List.of(1, 5, -3, 7);

        List<Integer> list = new ArrayList<>(list1);
        System.out.println(positiveCollection(list));
    }


//    public static int countCharAtWord(char symbol,String str) {
//        int count = 0;
////        char symbol = 'a';
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == symbol){
//                count++;
//            }
//        }return count;
//    }


//    public static char[] reversString(char[] chars) {
////

    //        char a ;
//        int i = 0;
//        int j = chars.length-1;
//        for (; i<=j; i++, j--) {
//            a = chars[i];
//            chars[i] = chars[j];
//            chars[j] = a;
//        }
//        return chars;
//    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int l = 0;
        int r = charArray.length - 1;

        while (l < r) {
            // Обмен значений между левым и правым указателями
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            // Сдвиг левого указателя вправо и правого указателя влево
            l++;
            r--;
        }

        return new String(charArray);
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

    // Реализуй метод, который поменяет ключи и значения в HashMap местами
    // На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
    public static Map<String, Integer> swepKeyAndValue(Map<Integer, String> map1) {
        HashMap<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
//            Integer mapKay = entry.getKey();
//            String mapValue = entry.getValue();
            swappedMap.put(entry.getValue(), entry.getKey());

        }
        return swappedMap;
    }


}
