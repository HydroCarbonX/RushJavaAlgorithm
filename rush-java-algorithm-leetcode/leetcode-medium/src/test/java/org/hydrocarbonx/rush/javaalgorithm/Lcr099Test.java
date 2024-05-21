package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-21
 */
class Lcr099Test {
    private final Lcr099 solution = new Lcr099();

    @Test
    void minPathSum_singleElementGrid() {
        int[][] grid = {{5}};
        int result = solution.minPathSum(grid);
        Assertions.assertEquals(5, result);
    }

    @Test
    void minPathSum_twoByTwoGrid() {
        int[][] grid = {{1, 3}, {2, 4}};
        int result = solution.minPathSum(grid);
        Assertions.assertEquals(7, result);
    }

    @Test
    void minPathSum_threeByThreeGrid() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = solution.minPathSum(grid);
        Assertions.assertEquals(7, result);
    }

    @Test
    void minPathSum_zeroElementGrid() {
        int[][] grid = {{0, 0}, {0, 0}};
        int result = solution.minPathSum(grid);
        Assertions.assertEquals(0, result);
    }
}
