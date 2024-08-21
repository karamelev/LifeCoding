package org.example;

public class BinarSearch {
    //дан отсортированный массив найти индекс искомого числа
    public static void main(String[] args) {
        int[] nums = {-1, 0, 5, 8, 12, 16};
        int target = 8;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (r >= l) {
            int middl = (r + l) / 2;
            if (nums[middl] == target) {
                return middl;
            } else if (nums[middl] < target) {
                l = middl + 1;
            } else {
                r = middl - 1;
            }
        }
        return -1;
    }

    //    Дан отсортированный по возрастанию массив целых чисел,
//    необходимо вернуть индексы двух чисел, сумма которых равна заданному числу.
//    Решить с помощью двух указателей. Нельзя использовать одно и то же число дважды.
//    Определить сложность решения.
//    Для примера: такой вызов должен вывести на экран [4, 8]:
//            System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 14)));
//*/
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

