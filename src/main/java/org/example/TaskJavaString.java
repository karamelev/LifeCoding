//package org.example;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static java.util.List.of;
//
///**
// Напишите функцию, которая возвращает количество различных буквенно-нечувствительных
// алфавитных символов и числовых цифр, которые встречаются более одного раза во входной строке.
// Можно предположить, что входная строка содержит только алфавиты (как верхний,
// так и нижний регистр) и цифровые цифры.
// *
// */
//
//public class TaskJavaString {
//
//
//    public static int countRepeatedChars(String inputString) {
//        inputString = inputString.toLowerCase(); // Приводим все символы к нижнему регистру
//        Map<Character, Integer> charCount = new HashMap<>();
//
//        for (char c : inputString.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) { // Проверяем, является ли символ буквой или цифрой
//                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        int repeatedCharsCount = 0;
//        for (int count : charCount.values()) {
//            if (count > 1) {
//                repeatedCharsCount++;
//            }
//        }
//
//        return repeatedCharsCount;
//    }
//
//    public static void main(String[] args) {
//        String inputString = "Abcde1234Abcde5678";
//        System.out.println(countRepeatedChars(inputString)); // Выведет: 5
//    }
//    // Написать метод который принимает массив email и валидирует их по регулярному выражению
//    public static List<String> emailValidation(String[] emailArray) {
//        return Arrays.stream(emailArray).filter(s->s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")).collect(Collectors.toList());
//    }
//
////    List<String> list = of("one","two","three");
////
////    Stream<String>streamForList = list.stream().filter(e->e.contains("h"));
//}  int i = 0 ;
////        int j = 1;
////        System.out.println(j+=(j<1)?(+j):(++i));
////
////        int a = 1;
////        int b = a++;
////        int c = a;
////        System.out.println(a);
////        System.out.println(b);
////        System.out.println(c);
//
////        int var = 1;
////        System.out.println(var++);
////        System.out.println(++var);
////        Integer var1 = 129;
////        Integer var2 = 129;
////        System.out.println(!var1.equals(var2));
////        System.out.println(var1.equals(var2));
////        System.out.println(var1 == var2);
////
////        System.out.println(var1 == var2 | !var1.equals(var2));
////        System.out.println(var1 == var2 & !var1.equals(var2));
////        System.out.println(var1 == var2 & var1.equals(var2));
////        System.out.println(var1 == var2 | var1.equals(var2));
//
////        String s = "abcdefghd";
////        String[] pairs = splitIntoPairs(s);
////
////        for (String pair : pairs) {
////            System.out.println(pair);
////        }
////        binaryAddition(10,20);
//
//
//}
//
//
//    public static String[] splitIntoPairs(String s) {
//        if (s.length() % 2 != 0) {
//            s += "_";
//        }
//
//        // Разбиваем строку на пары двух символов с помощью метода split
//       return s.split("(?<=\\G.{2})");
//
//    }
//
//    public static String binaryAddition(int a, int b){
//        int sum = a + b;
//        return (Integer.toBinaryString(sum));
//    }
//    List<String> list = List.of("1","2","3","4","5");
//