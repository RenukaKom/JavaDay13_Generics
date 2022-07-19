package com.bridgelabz.day13;

public class MaximumRefactor1 {
    public static void main(String[] args) {
        Integer[] intArr = {50, 40, 80};
        new GenericMaximum(intArr).getMaximum();
        Float[] floatArr = {2.3f, 9.5f, 5.2f, 6.8f};
        new GenericMaximum(floatArr).getMaximum();
        String[] strArr = {"Apple", "Peach", "Banana"};
        new GenericMaximum(strArr).getMaximum();
    }
}

class GenericMaximum <Maximum extends Comparable<Maximum>> {
    private Maximum[] inputArray;

    GenericMaximum(Maximum[] inputArray) {
        this.inputArray = inputArray;
    }
    public void getMaximum() {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
    }
}