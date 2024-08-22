package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {
    // поворот строки
    // Развернуть произвольную строку
    // без использования методов типа reverse() и split()
    // и при этом используя один массив

    public static void main(String[] args) {

//        char[] chars = "Повернуть строку".toCharArray();
//        System.out.println(reversStringWithChar(chars));
//
//        int num = 123445;
//        System.out.println(reverseInt(num));
//
//        String str = "Hello, world!";
//        String reversedString = reverseString(str);
//        System.out.println("Original string: " + str);
//        System.out.println("Reversed string: " + reversedString);
//
//        String str2 = "Перевернуть строку, изменив расположение символов
//        в строке задом наперёд без использования встроенной
//        в String функции reverse().";
//        System.out.println(revertStr2(str2));

        String str1 = " Hello, world! ";
        System.out.println(revertStr2(str1));

//        int[] array = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(arrayRevers(array)));
//

    }

    public static int reverseInt(int num) {
        char[] s = String.valueOf(num).toCharArray();
        Arrays.sort(s);
//        String s = Integer.toString(num);
//        char[] arrayStr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length - 1; i++) {
            stringBuilder.append(s[s.length - 1 - i]);
        }

        return Integer.parseInt(String.valueOf(stringBuilder));
    }

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

    public static String revertStr2(String str2) {
        String[] array = str2.split(" ");
        StringBuffer arrayBuff = new StringBuffer();
        for (int i = 0; i < array.length - 1; i++) {
            arrayBuff
                    .append(array[array.length - 1 - i]);
//                    .append(" ");
        }
        return arrayBuff.toString();
    }

    public static char[] reversStringWithChar(char[] chars) {
        char a;
        int i = 0;
        int j = chars.length - 1;
        for (; i <= j; i++, j--) {
            a = chars[i];
            chars[i] = chars[j];
            chars[j] = a;
        }
        return chars;
    }

    public static String reverseStringWithStream(String str1) {
        return IntStream.range(0, str1.length())
                .mapToObj(i -> str1.charAt(str1.length() - i - 1))
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    public static int[] arrayRevers(int[] array) {
        int[] array1 = new int[array.length];

        for (int i = 0; i <= array.length - 1; i++) {
            array1[i] = array[array.length - 1 - i];
        }
        return array1;
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(e -> e > 0).sum();
    }
}
