package org.example;

public class Loops {


    static int returnFirstIndexForZeroElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int returnSumOfAllElements(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

}