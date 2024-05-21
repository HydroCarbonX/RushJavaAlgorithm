package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-21
 */
class _746Test {
    private final _746 solution = new _746();

    @Test
    void minCostClimbingStairs_withMinimumCostPath() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }

    @Test
    void minCostClimbingStairs_withMultipleMinimumCostPaths() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }

    @Test
    void minCostClimbingStairs_withSingleStep() {
        int[] cost = {10};
        int expected = 0;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }

    @Test
    void minCostClimbingStairs_withTwoSteps() {
        int[] cost = {10, 20};
        int expected = 10;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }

    @Test
    void minCostClimbingStairs_withEmptyInput() {
        int[] cost = {};
        int expected = 0;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }
}
