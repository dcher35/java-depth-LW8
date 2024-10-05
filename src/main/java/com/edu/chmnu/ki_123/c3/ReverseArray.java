package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        double[] array = {1.2, -3.4, 9.6, 5.2, -6.3};

        System.out.println("Initial array: " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Array after reordering: " + Arrays.toString(array));
    }

    public static void reverseArray(double[] array) {
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            double temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}