package com.demo.cn;

import java.util.ArrayList;

/**
 * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * <p>
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-place-flowers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入: flowerbed = [1,0,0,0,1], n = 1
 * 输出: True
 *
 * @version 1.02021/1/1
 * @auther Richard)yyf
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] flowerBed = {1, 0, 0, 0, 0, 0, 1};
        int n = 3;
        System.out.println(flower(flowerBed, n));
    }

    public static boolean flower(int[] flower, int n) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] == 0 && flower[i - 1] == 0 && flower[i + 1] == 0 && i > 0 && i < flower.length - 1 && !integers.contains(i) && !integers.contains(i - 1) && !integers.contains(i + 1)) {
                integers.add(i);
                n--;
            }
        }
        if (n > 0) {
            return false;
        }
        return true;
    }

}
