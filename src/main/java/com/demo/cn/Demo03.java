package com.demo.cn;

import java.io.File;

/**
 * 打印磁盘剩余空间
 *
 * @version 1.02020/12/30
 * @auther Richard)yyf
 */
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("c:");
        long freeSpace = file.getFreeSpace();
        long totalSpace = file.getTotalSpace();
        long usedSpace = totalSpace - freeSpace;
        System.out.println("总空间大小："+totalSpace/1024/1024/1024+"G");
        System.out.println("剩余空间大小："+freeSpace/1024/1024/1024+"G");
        System.out.println("已用空间大小："+usedSpace/1024/1024/1024+"G");
    }
}
