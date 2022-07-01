package task.leetcode;

/*Условие задачи: https://leetcode.com/problems/two-sum/

Дан массив уникальных целых чисел nums и целое число target, верните два числа из массива так, чтобы в сумме они составляли target.

 */

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // => [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // => [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{0, 3, 3}, 6))); // => [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4, 3}, 6))); // => [0, 3]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 6))); // => No solution for defined input data!
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution for defined input data!"); //Если в рамках полученных данных не нашли решения, то тогда мы бросаем исключение
    }
}
