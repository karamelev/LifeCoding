package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ToSum {
    public static void main(String[] args) {
//Дан массив чисел и число target - найти в массиве два числа, которые в сумме дают target.
//Вернуть массив с их индексами. Будем считать, что в каждом переданном массиве есть такие числа
//
//Input: nums = [2,7,11,15], target = 9
        int[] nums = {7,2,11,15};
        int target = 9;
        System.out.println(Arrays.toString(toSum(nums, target)));
        System.out.println(Arrays.toString(twoSumBinar(nums, target)));
    }
    public static int[] toSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSumBinar(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
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
