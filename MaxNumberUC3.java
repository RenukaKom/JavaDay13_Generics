package com.bridgelabz.day13;

public class MaxNumberUC3 {
    public static void main(String[] args) {
        String[] strArr = {"Apple", "Peach", "Banana"};
        MaxNumberUC3 max = new MaxNumberUC3();
        max.getMaxFromString(strArr);
    }
    public void getMaxFromString(String[] strArr) {
        for (int i = 0; i < strArr.length-1; i++) {
            if (strArr[i].compareTo(strArr[i + 1]) > 0) {
                strArr[i + 1] = strArr[i];
            }
        }
        System.out.print(strArr[strArr.length - 1]);
    }
}

