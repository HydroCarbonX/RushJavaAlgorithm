package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention"})
class _1758MinimumChangesToMakeAlternatingBinaryStringTest {

    private static final _1758MinimumChangesToMakeAlternatingBinaryString solution =
            new _1758MinimumChangesToMakeAlternatingBinaryString();

    @Test
    void minOperations() {
        String s = "0100";
        int result;
        result = solution.minOperations(s);
        Assertions.assertEquals(1, result);

        s = "10";
        result = solution.minOperations(s);
        Assertions.assertEquals(0, result);

        s = "1111";
        result = solution.minOperations(s);
        Assertions.assertEquals(2, result);
    }
}
