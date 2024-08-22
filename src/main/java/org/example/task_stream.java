package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task_stream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream().filter( e-> e % 2 != 0).sorted(Comparator.reverseOrder()).map(x -> x + ",").forEach(System.out::print);
        int min = numbers.stream().min(Integer::compare).get();

        System.out.println(min);
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);
        int sum = numbers.stream()
                .filter(e -> e % 2 != 0)
                .reduce(Integer::sum)
                .orElseThrow(RuntimeException::new);
        System.out.println("sum" + sum);

        List<String> list = Arrays.asList(
                "Hello,World",
                "I hoop you are doing well",
                "Hello, again",
                "You are welcome");
        Optional<String> string = list.stream().reduce((x, y) -> x + y);


        System.out.println("string = " + string.get());

        long uniqueWordCount = list.stream()
                .flatMap(line -> Arrays.stream(line.split("[\\s,]+")))
                .map(String::toUpperCase)
                .distinct()
                .count();

        System.out.println("Number of unique words: " + uniqueWordCount);


        long i = list.stream().
                map(str -> str.split("[\\s,]+"))
                .flatMap(Arrays::stream)
                .map(String::toUpperCase)
                .distinct()
                .count();
        System.out.println(i);
    }
//    У вас есть список объектов с разными свойствами, включая категорию и числовое значение.
//    Используя Stream API, сгруппируйте объекты по категориям и вычислите сумму числовых значений для каждой категории

    public class Main {

        public void main(String[] args) {
            // Предположим, у вас есть список объектов SomeObject
            List<SomeObject> objects = Arrays.asList(
                    new SomeObject("Category1", 10),
                    new SomeObject("Category2", 20),
                    new SomeObject("Category1", 30),
                    new SomeObject("Category3", 40),
                    new SomeObject("Category2", 50)
            );

//            System.out.println("Категория: " + category + ", Сумма значений: " + sum));


        }

        // Пример класса SomeObject (замените на ваш класс)
        class SomeObject {
            private String category;
            private int value;

            public SomeObject(String category, int value) {
                this.category = category;
                this.value = value;
            }

            public String getCategory() {
                return category;
            }

            public int getValue() {
                return value;
            }
        }
    }


//.................


//
//    Задача: Параллельная обработка больших данных
//    У вас есть большой список чисел. Используя параллельный поток с помощью Stream API, вычислите сумму всех чисел из списка
//
//
//
//
//    Задача: Работа с вложенными коллекциями
//    У вас есть список объектов, каждый из которых содержит список вложенных объектов. Используя Stream API,
//    получите все вложенные объекты, отфильтруйте их по определенному условию и выведите результат.


//    public static class Mains {
//        public void main(String[] args) {
//            // Предположим, у вас есть список объектов MainObject
//            List<MainObject> mainObjects = new ArrayList<>();
//            mainObjects.add(new MainObject(List.of(new NestedObject(1), new NestedObject(2), new NestedObject(3))));
//            mainObjects.add(new MainObject(List.of(new NestedObject(4), new NestedObject(5))));
//            mainObjects.add(new MainObject(List.of(new NestedObject(6), new NestedObject(7), new NestedObject(8))));
//
//            // Получаем все вложенные объекты, удовлетворяющие условию (например, значение больше 5)
//
//
//        }
}


class MainObject {
    private List<NestedObject> nestedObjects;

    public MainObject(List<NestedObject> nestedObjects) {
        this.nestedObjects = nestedObjects;
    }

    public List<NestedObject> getNestedObjects() {
        return nestedObjects;
    }
}

class NestedObject {
    private int value;

    public NestedObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "NestedObject{" +
                "value=" + value +
                '}';
    }
}


//   Map<String, Integer> map = items.stream().collect(Collectors.groupingBy(Item::getCategory(), Collectors.summingInt(Item::getValue());
//        map.forEach((category, sum)->System.out.println("Категория: " + category + ", Сумма: " + sum)));

//        System.out.println("Категория: " + category + ", Сумма: " + sum));
//}
//
//
//Учитывая целочисленный массив nums, возвращайте значение true,
//если какое-либо значение встречается в массиве хотя бы дважды,
//и возвращайте значение false, если каждый элемент различен.
//
//public class ContainsDuplicate {
//
//    public static void main(String[] args) {
//        System.out.println(new Solution().containsDuplicate(new int[]{1, 2, 3, 1})); //true
//        System.out.println(new Solution().containsDuplicate(new int[]{1, 2, 3, 4})); //false
//    }
//
//}
//
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//
// List<NestedObject> filteredNestedObjects = mainObjects.stream()
//                .flatMap(mainObject -> mainObject.getNestedObjects().stream()) // Получаем Stream всех вложенных объектов
//                .filter(nestedObject -> nestedObject.getValue() > 5) // Фильтруем по условию
//                .collect(Collectors.toList()); // Собираем результат в список
//
//        // Выводим результат
//        filteredNestedObjects.forEach(System.out::println);
//           );
//        }
//
//    }
//}