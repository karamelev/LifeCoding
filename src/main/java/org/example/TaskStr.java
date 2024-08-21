package org.example;

import java.util.HashMap;
import java.util.Map;

public class TaskStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sd";
        System.out.println(strStr(haystack, needle));// верните индекс первого вхождения

        String[] strs = {"полог", "поло", "половик"};//вхожднгтн префекса
        System.out.println(longestCommonPrefix(strs));

        String s = "LVII";
        System.out.println(romanToInt(s));// перевести латинские цифры в арабские

        String str = "Перевернуть строку, изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().";
        String str2 = revertStr2(str);
        System.out.println(str2);

        String word = "aligator";// посчитать количество символов в строке
        char simbl = 'a';
        System.out.println(counLetersInWord(word,simbl));

        String str1 = "abc";
        String str3 = "pqr";
        System.out.println(twoString(str1,str3));

        String inputString = "Abcde1234Abcde5678";
        System.out.println(countRepeatedChars(inputString)); // Выведет: 5
    }

    //Учитывая две строки needleи haystack,
    // верните индекс первого вхождения needlein haystackили, -1если needleон не является частью haystack.
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int hLength = haystack.length();
        int nLength = needle.length();

        for (int i = 0; i <= hLength - nLength; i++) {
            if (haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }

        return -1;
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

    //перевести латинские цифры в арабские
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

    public static String revertStr2(String str2) {
        String[] array = str2.split(" ");
        StringBuffer arrayBuff = new StringBuffer();
        for (int i = 0; i < array.length - 1; i++) {
            arrayBuff
                    .append(array[array.length - 1 - i])
                    .append(" ");
        }
        return arrayBuff.toString();
    }


//посчитать количество входящих символов в слове
    public static int counLetersInWord(String word, char simbl) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == simbl) {
                count++;
            }


        }
        return count;
    }

//    Если даны две строки str1 и str2, верните самую большую строку x, такую, что x делит и str1, и str2.
    public static String twoString(String str1 , String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        int minLength = Math.min(str1.length(), str3.length());
        for (int i = 0; i < minLength; i++) {
            stringBuffer.append(str1.charAt(i)).append(str3.charAt(i));

        }
        stringBuffer.append(str1.substring(minLength)).append(str3.substring(minLength));
        return stringBuffer.toString();
    }

    //  Напишите функцию, которая возвращает количество различных буквенно-нечувствительных
    // алфавитных символов и числовых цифр, которые встречаются более одного раза во входной строке.
    // Можно предположить, что входная строка содержит только алфавиты (как верхний,
    // так и нижний регистр) и цифровые цифры.
    public static int countRepeatedChars(String inputString) {
        inputString = inputString.toLowerCase(); // Приводим все символы к нижнему регистру
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Проверяем, является ли символ буквой или цифрой
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        int repeatedCharsCount = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                repeatedCharsCount++;
            }
        }

        return repeatedCharsCount;
    }


}
