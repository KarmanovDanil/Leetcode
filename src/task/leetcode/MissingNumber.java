package task.leetcode;/*Условие задачи
https://leetcode.com/problems/missing-number/

Сумма положительных натуральных чисел от 1 до n, то есть, 1+2+3+...+n, вычисляется по формуле n*(n+1)/2

Решение:
1. Найдите сумму n чисел по формуле n=n*(n+1)/2
2. Найдите сумму элементов, присутствующих в данном массиве.
3. Вычесть (сумма n чисел — сумма элементов, присутствующих в массиве).
 */

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 4, 5, 6};
        System.out.println("Missing number from array: " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        int missingNumber = sum - result;
        return missingNumber;
    }
}
