package org.example;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        int [] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    Set<Integer> set1 =  distinct(sortedList);
//    for (Integer e : set1) {
//        System.out.println(e);
//    }
//        Arrays.stream(sortedList).distinct().forEach(System.out::print);
        int[] array1 = distinct(sortedList);
        System.out.println(Arrays.toString(array1));
    }
public static int[] distinct (int[] sortedList) {
    List<Integer> list = new ArrayList<>();
    for (int e : sortedList) {
        list.add(e);
    }
    Set<Integer> set = new LinkedHashSet<>(list);

    //    for (int e : set) {
//        System.out.print(e + ",");
        int[] array =  set.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

}

//       ;Пeревернуть строку без использования методов типа reverse используя один массив.
//       Пример: myReverse("12345".toCharArray()). Результат: "54321"

//

//        char [] str = "123456".toCharArray();
//        for (int i = str.length-1; i >= 0 ; i--) {
//            System.out.println(str[i]);

    //        }



//        5. Реализовать метод, который будет возвращать количество
//        передаваемого символа в слове. Пример: countCharAtWord('a', \"Aligator\") = 2

//        String word = "Aligator";
//        char simdl = 'a';
//        int count = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == simdl) {
//                count ++;
//            }
//
//
//        }
//        System.out.println(count);


//        Напишите функцию проверки валидности открытия/закрытия с
//        кобок. Пример: validate("[{}([])]"). Результат: true
//        String string = "[{}([])]";
//        Stack<Character> stek = new Stack<>();
//        for (char e : string.toCharArray()) {
//            if (e == '[' || e == '{' || e == '(') {
//                stek.push(e);
//            } else if (e == ')' && (stek.isEmpty() || stek.pop() != '(')) {
//                System.out.println("не валидно");
//
//            } else if (e == ']' && (stek.isEmpty() || stek.pop() != '[')) {
//                System.out.println("не валидно");
//            } else if (e == '}' && (stek.isEmpty() || stek.pop() != '{')) {
//                System.out.println("не валидно");
//
//            } else System.out.println("валидно");
//

//        String string = "[{}([])]";
//        Stack<Character> stack = new Stack<>();
//        for (char e : string.toCharArray()) {
//            if (e == '[' || e == '{' || e == '(') {
//                stack.push(e);
//            } else if (e == ']' && (stack.isEmpty() || stack.pop() != '[')) {
//                System.out.println("не валидно");
//            } else if (e == '}' && (stack.isEmpty() || stack.pop() != '{')) {
//                System.out.println("не валидно");
//            } else if (e == ')' && (stack.isEmpty() || stack.pop() != '(')) {
//                System.out.println("не валидно");
////
//            } else System.out.println("валидно");
//
//        }
//    }

