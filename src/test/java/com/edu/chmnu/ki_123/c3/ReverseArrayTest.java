package com.edu.chmnu.ki_123.c3;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class ReverseArrayTest {
    // Тест для порожнього масиву
    @Test
    public void testEmptyArray() {
        double[] input = {};
        double[] expected = {};

        ReverseArray.reverseArray(input);

        assertArrayEquals(expected, input, 0.01);
    }

    //Тест для перевірки методу перевороту масиву
    @Test
    public void testReverseArray() {
        double[] input = {1.2, -3.4, 9.6, 5.2, -6.3};
        double[] expected = {-6.3, 5.2, 9.6, -3.4, 1.2};

        ReverseArray.reverseArray(input);

        assertArrayEquals(expected, input, 0.01);
    }

    //Тест для перевірки типу масиву
    @Test
    public void testArrayIsDouble() {
        double[] input = {1.2, -3.4, 5, 5.2, -6.3};

        for (double num : input) {
            assertFalse("Element is not a valid number: " + num, Double.isNaN(num));
        }
    }
}
