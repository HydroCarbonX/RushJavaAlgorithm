package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
class _2278Test {

    private final _2278 solution = new _2278();

    @Test
    void percentageLetter_returnsCorrectPercentageForSingleOccurrence() {
        assertEquals(20, solution.percentageLetter("abcde", 'a'));
    }

    @Test
    void percentageLetter_returnsCorrectPercentageForMultipleOccurrences() {
        assertEquals(33, solution.percentageLetter("aabbcc", 'a'));
    }

    @Test
    void percentageLetter_returnsZeroWhenLetterNotPresent() {
        assertEquals(0, solution.percentageLetter("abcdef", 'z'));
    }

    @Test
    void percentageLetter_returns100WhenOnlyOneLetterAndMatches() {
        assertEquals(100, solution.percentageLetter("aaaaa", 'a'));
    }

    @Test
    void percentageLetter_returnsZeroForEmptyString() {
        assertEquals(0, solution.percentageLetter("", 'a'));
    }
}
