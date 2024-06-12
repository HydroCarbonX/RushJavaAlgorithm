package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-06-12
 */
class _2806Test {

    private final _2806 solution = new _2806();

    @Test
    void shouldReturnCorrectBalanceWhenPurchaseAmountIsExactMultipleOfTen() {
        assertEquals(60, solution.accountBalanceAfterPurchase(40));
    }

    @Test
    void shouldReturnCorrectBalanceWhenPurchaseAmountIsNotMultipleOfTen() {
        assertEquals(70, solution.accountBalanceAfterPurchase(34));
    }

    @Test
    void shouldReturnCorrectBalanceWhenPurchaseAmountIsZero() {
        assertEquals(100, solution.accountBalanceAfterPurchase(0));
    }

    @Test
    void shouldReturnCorrectBalanceWhenPurchaseAmountIsMoreThanHundred() {
        assertEquals(-100, solution.accountBalanceAfterPurchase(200));
    }
}
