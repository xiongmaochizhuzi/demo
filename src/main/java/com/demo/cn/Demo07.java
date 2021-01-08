package com.demo.cn;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 * @version 1.02021/1/1
 * @auther Richard)yyf
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int arr1 = arr(arr, 2);
        System.out.println(arr1);

    }

    public static int arr(int[] arr, int n) {
        int temp = -1;
        int[] ints = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n && n < arr[i + 1]) {
                temp = i+1;
                ints[i+1] = n;
                for (int j = i+1; j < arr.length; j++) {
                    ints[j + 1] = arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(ints));

        return temp;
    }

}
