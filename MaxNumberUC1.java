package com.bridgelabz.day13;

//Given 3 Integers find the maximum
public class MaxNumberUC1 {
    public static void main(String[] args) {
        Integer[] intArr = {20, 50, 30, 40};
        MaxNumberUC1 max = new MaxNumberUC1();
        max.getMaxNumber(intArr);
    }

    public void getMaxNumber(Integer[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i].compareTo(intArr[i + 1]) > 0) {
                intArr[i + 1] = intArr[i];
            }
        }
        System.out.print(intArr[intArr.length - 1]);

    }
}