package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
class _3033Test {

    private final _3033 solution = new _3033();

    @Test
    void modifiedMatrixWithPositiveNumbers() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 2}, {3, 4}};
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }

    @Test
    void modifiedMatrixWithNegativeNumbers() {
        int[][] input = {{-1, 2}, {3, -1}};
        int[][] expected = {{3, 2}, {3, 2}};
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }

    @Test
    void modifiedMatrixWithAllNegativeNumbers() {
        int[][] input = {{-1, -1}, {-1, -1}};
        int[][] expected = {{-1, -1}, {-1, -1}}; // Assuming the behavior for all -1s is to leave them unchanged
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }

    @Test
    void modifiedMatrixWithMixedNumbers() {
        int[][] input = {{-1, 10}, {3, -1}, {5, -1}};
        int[][] expected = {{5, 10}, {3, 10}, {5, 10}};
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }

    @Test
    void modifiedMatrixWithSingleElement() {
        int[][] input = {{-1}};
        int[][] expected = {{-1}}; // Assuming the behavior for a single -1 is to leave it unchanged
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }

    @Test
    void modifiedMatrixWithEmptyMatrix() {
        int[][] input = new int[0][0];
        int[][] expected = new int[0][0];
        assertArrayEquals(expected, solution.modifiedMatrix(input));
    }
}