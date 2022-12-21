package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention"})
class _1753MaximumScoreFromRemovingStonesTest {

    private final _1753MaximumScoreFromRemovingStones solution = new _1753MaximumScoreFromRemovingStones();

    @Test
    void maximumScore() {
        int a = 2;
        int b = 4;
        int c = 6;
        int result = solution.maximumScore(a, b, c);
        Assertions.assertEquals(6, result);

        a = 4;
        result = solution.maximumScore(a, b, c);
        Assertions.assertEquals(7, result);

        a = 1;
        b = 8;
        c = 8;
        result = solution.maximumScore(a, b, c);
        Assertions.assertEquals(8, result);
    }
}
