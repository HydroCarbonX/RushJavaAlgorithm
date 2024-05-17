package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-17
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _826Test {

    private final _826 solution = new _826();

    @Test
    void shouldReturnMaxProfitForAllWorkers() {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};
        int expected = 100;
        assertEquals(expected, solution.maxProfitAssignment(difficulty, profit, worker));
    }

    @Test
    void shouldReturnZeroWhenNoWorkerCanCompleteAnyJob() {
        int[] difficulty = {5, 10, 15, 20, 25};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {1, 2, 3, 4};
        int expected = 0;
        assertEquals(expected, solution.maxProfitAssignment(difficulty, profit, worker));
    }

    @Test
    void shouldReturnMaxProfitWhenMultipleJobsHaveSameDifficulty() {
        int[] difficulty = {2, 2, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {2, 6, 8, 10, 12};
        int expected = 190;
        assertEquals(expected, solution.maxProfitAssignment(difficulty, profit, worker));
    }

    @Test
    void shouldReturnMaxProfitWhenWorkersHaveSameAbility() {
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {6, 6, 6, 6, 6};
        int expected = 150;
        assertEquals(expected, solution.maxProfitAssignment(difficulty, profit, worker));
    }
}
