package com.iceblock.study.algorithm;

import com.iceblock.study.algorithm.util.PrintUtil;

/**
 * 简单排序
 *
 * @author liangyan
 * @date 2018/4/11
 */
public class SimpleSort {

    public static void main(String[] args) {
        int[] inNumArr = {4, 1, 3, 5, 2};
        bubbleSort(inNumArr);
    }

    /**
     * 普通冒泡排序，时间复杂度 O(N^2)，即等差数列之和
     */
    private static void bubbleSort(int[] inNumArr) {
        int count = 0;
        int temp;
        for (int j = 0; j < inNumArr.length - 1; j++) {
            for (int i = 0; i < inNumArr.length - 1 - j; i++) {
                temp = inNumArr[i + 1];
                if (inNumArr[i] > inNumArr[i + 1]) {
                    inNumArr[i + 1] = inNumArr[i];
                    inNumArr[i] = temp;
                }
                count++;
                PrintUtil.printIntArr(inNumArr);
            }
        }
        System.out.println("比较次数：" + count);
    }

    /**
     * 冒泡排序改进，时间复杂度 O(1) ~ O(N^2)，顺序正常之和停止循环
     */
    private static void bubbleSortImprove(int[] inNumArr) {
        boolean didSwap;
        int temp;
        for (int j = 0; j < inNumArr.length - 1; j++) {
            didSwap = false;
            for (int i = 0; i < inNumArr.length - 1 - j; i++) {
                temp = inNumArr[i + 1];
                if (inNumArr[i] > inNumArr[i + 1]) {
                    inNumArr[i + 1] = inNumArr[i];
                    inNumArr[i] = temp;
                    didSwap = true;
                }
                PrintUtil.printIntArr(inNumArr);
                if (!didSwap) {
                    return;
                }
            }
        }
    }

}
