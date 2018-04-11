package com.iceblock.study.algorithm.util;

import java.time.LocalDateTime;

/**
 * @author liangyan
 * @date 2018/4/11
 */
public class PrintUtil {

    public static void printIntArr(int[] inNumArr) {
        StringBuilder numBuilder = new StringBuilder();
        for (int i : inNumArr) {
            numBuilder.append(i).append(", ");
        }
        numBuilder.deleteCharAt(numBuilder.length() - 1);
        numBuilder.deleteCharAt(numBuilder.length() - 1);
        System.out.println(LocalDateTime.now() + " : " + numBuilder.toString());
    }
}
