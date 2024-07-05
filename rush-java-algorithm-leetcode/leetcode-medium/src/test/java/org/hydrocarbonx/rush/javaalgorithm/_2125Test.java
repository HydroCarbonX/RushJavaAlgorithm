package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
class _2125Test {

    private final _2125 solution = new _2125();

    @Test
    void numberOfBeams_withNoBeams_returnsZero() {
        assertEquals(0, solution.numberOfBeams(new String[]{"000", "000", "000"}));
    }

    @Test
    void numberOfBeams_withSingleBeamInOneRow_returnsZero() {
        assertEquals(0, solution.numberOfBeams(new String[]{"001", "000", "000"}));
    }

    @Test
    void numberOfBeams_withBeamsInAdjacentRows_returnsProductOfBeams() {
        assertEquals(1, solution.numberOfBeams(new String[]{"010", "001", "000"}));
    }

    @Test
    void numberOfBeams_withBeamsInNonAdjacentRows_returnsProductOfBeams() {
        assertEquals(2, solution.numberOfBeams(new String[]{"100", "000", "011"}));
    }

    @Test
    void numberOfBeams_withMultipleBeamsInMultipleRows_returnsSumOfProducts() {
        assertEquals(4, solution.numberOfBeams(new String[]{"101", "010", "101"}));
    }

    @Test
    void numberOfBeams_withAllRowsHavingBeams_returnsCorrectSumOfProducts() {
        assertEquals(12, solution.numberOfBeams(new String[]{"111", "101", "111"}));
    }

    @Test
    void numberOfBeams_withEmptyArray_returnsZero() {
        assertEquals(0, solution.numberOfBeams(new String[]{}));
    }
}
