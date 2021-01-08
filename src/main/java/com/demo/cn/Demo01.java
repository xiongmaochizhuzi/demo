package com.demo.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有一堆石头，每块石头的重量都是正整数。
 * <p>
 * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * <p>
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/last-stone-weight
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @version 1.02020/12/30
 * @auther Richard)yyf
 */
public class Demo01 {
    public static void main(String[] args) {

        int[] t = {2,7,4,1,8,1};
        int[] ints = delete1(t);
        if (ints.length == 0) {
            System.out.println(0);
        } else {
            System.out.println(ints[ints.length - 1]);
        }

    }


    /**
     * 冒泡排序
     * @param list 需要排序的数组
     * @return
     */
    public static int[] sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int i1 = 0; i1 < list.length - i - 1; i1++) {
                if (list[i1 + 1] < list[i1]) {
                    int temp = list[i1 + 1];
                    list[i1 + 1] = list[i1];
                    list[i1] = temp;
                }
            }
        }
        return list;
    }


    /**
     * @param listA 需要处理的数组
     * @return
     */
    public static int[] delete1(int[] listA) {
        if (listA.length <= 1) {
            return listA;
        } else {
            int[] sort = sort(listA);
            if (sort[sort.length - 2] == sort[sort.length - 1]) {
                int[] ints = Arrays.copyOf(sort, sort.length - 2);
                return delete1(ints);
            } else {
                sort[sort.length - 2] = sort[sort.length - 1] - sort[sort.length - 2];
                int[] ints = Arrays.copyOf(sort, sort.length - 1);
                return delete1(ints);
            }
        }
    }

}
