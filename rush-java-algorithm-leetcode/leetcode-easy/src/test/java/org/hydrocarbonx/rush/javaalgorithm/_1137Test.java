package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-21
 */
class _1137Test {
    private final _1137 tribonacciCalculator = new _1137();

    @Test
    void tribonacciOfZero() {
        assertEquals(0, tribonacciCalculator.tribonacci(0));
    }

    @Test
    void tribonacciOfOne() {
        assertEquals(1, tribonacciCalculator.tribonacci(1));
    }

    @Test
    void tribonacciOfTwo() {
        assertEquals(1, tribonacciCalculator.tribonacci(2));
    }

    @Test
    void tribonacciOfThree() {
        assertEquals(2, tribonacciCalculator.tribonacci(3));
    }

    @Test
    void tribonacciOfTen() {
        assertEquals(149, tribonacciCalculator.tribonacci(10));
    }
}
