package com.demo.cn;

/**
 * 二分查找
 *
 * @version 1.02020/12/30
 * @auther Richard)yyf
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] t={2,7,4,10,8,1};
        System.out.println(find(t,4,0,t.length-1));
    }

    /**
     * @param arr           有序数组
     * @param number       需要查找的数
     * @param minNumber   最小值
     * @param maxNumber   最大值
     * @return
     */
    public static int find(int[] arr, int number, int minNumber, int maxNumber) {
        if (minNumber > maxNumber) {
            return -1;
        }
        int mid = minNumber + (maxNumber - minNumber) / 2;
        if (number < arr[mid]) {
            return find(arr,number,minNumber,mid-1);
        }else if(number>arr[mid]){
            return find(arr,number,mid+1,maxNumber);
        }else {
            return mid;
        }
    }

}
