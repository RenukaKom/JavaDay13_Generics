package com.bridgelabz.day13;

public class MaxNumberUC2 {
    public static void main(String[] args) {
        Float[] floatArr = {2.3f, 5.2f, 6.8f};
        MaxNumberUC2 max = new MaxNumberUC2();
        max.getMaxNumber(floatArr);
    }

    public void getMaxNumber(Float[] floatArr) {
        for (int i = 0; i < floatArr.length-1; i++) {
            if(floatArr[i].compareTo(floatArr[i+1]) > 0){
                floatArr[i+1] = floatArr[i];
            }
        }
        System.out.print(floatArr[floatArr.length-1]);
    }

}

