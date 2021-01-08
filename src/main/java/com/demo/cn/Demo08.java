package com.demo.cn;

/**
 * 无重复字符的最长子串
 *
 * @version 1.02021/1/3
 * @auther Richard)yyf
 */
public class Demo08 {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(length(str));
    }

    public static int length(String str) {

        int i = 0;
        int length = 0;
        int flag = 0;
        int result = 0;
        while (i < str.length()) {
            int pos = str.indexOf(str.charAt(i), flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= str.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }

}
