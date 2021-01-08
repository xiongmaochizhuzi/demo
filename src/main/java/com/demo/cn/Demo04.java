package com.demo.cn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 半解决
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @version 1.02020/12/30
 * @auther Richard)yyf
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 6, 7, 8, 9, 1, 9, 8, 3, 4, 6, 7};
        ArrayList<int[]> ints = find(arr, 10);
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(Arrays.toString(ints.get(i)));
        }

    }

    /**
     * @param arr 需要应用的数组
     * @param number 给定的数字
     * @return
     */
    public static ArrayList<int[]> find(int[] arr, int number) {
        ArrayList<int[]> arrayList = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!integers.contains(i)) {
                for (int i1 = i + 1; i1 < arr.length; i1++) {
                    if (!integers.contains(i1)) {
                        if (arr[i] + arr[i1] == number) {
                            int[] n = {i, i1};
                            arrayList.add(n);
                            integers.add(i);
                            integers.add(i1);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

}
