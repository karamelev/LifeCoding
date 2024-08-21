package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LC_Vlasov_Stream {
    public static void main(String[] args) {


        //У вас есть список строк. Используя Stream API, преобразуйте каждую строку в верхний регистр и соберите результат в новый список.
        //public class Main {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> upperCaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Строки в верхнем регистре: " + upperCaseStrings);


        //У вас есть список строк. Используя Stream API, отсортируйте строки по их длине.

        List<String> list = Arrays.asList("banana","apple","cherry", "date");
//        List<String> strings = list.stream().sorted((e, x) -> e.length() - x.length()).collect(Collectors.toList());
        List<String> string = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        System.out.println("Строки отсортированные по длине: " + string);

        List<Integer> list1 = Arrays.asList(65,60,128, 135);
        List<Integer> list2 = Arrays.asList(36,92,168,299);
        Stream.concat(list1.stream(),list2.stream()).filter(e-> e >100).forEach(System.out::println);

//        /вернуть список user у которых группа начинается на "x"

    }
        public List<User> getUsers(Stream <User> userStream) {

        return  userStream
                    .filter(e -> e.getGroups().stream()
                    .anyMatch(x -> x.getName().startsWith("x"))).collect(Collectors.toList());

        }

//    int[] arr1 = {1, 1, 2, 3, 5, 5, 7};
//        int[] arr2 = {2, 3, 4, 6, 8};
//        method1(arr1, arr2);

    public static int[] method1(int[] arr1, int[] arr2) {
        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        return Arrays.stream(arr1).filter(e -> !IntStream.of(arr2).anyMatch(x -> x == e)).toArray();

    }
    //filter > 10 , отсортировать по убыванию, положить в коллект
//        int[] arr1 = {1, 1, 2, 3, 5, 5, 7, 13, 1, 65, 23, 11, 67, 43, 27, 8, 1, 12, 65};
    public static void sorttd(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed()
                .filter(e -> e > 10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }






}


 class User {

    private String name;
    private Integer age;
    private List<Groups> groups;

     public String getName() {
         return name;
     }

     public Integer getAge() {
         return age;
     }

     public List<Groups> getGroups() {
         return groups;
     }
 }


 class Groups {

    private String name;
    private String description;

     public String getName() {
         return name;
     }

     public String getDescription() {
         return description;
     }
 }
