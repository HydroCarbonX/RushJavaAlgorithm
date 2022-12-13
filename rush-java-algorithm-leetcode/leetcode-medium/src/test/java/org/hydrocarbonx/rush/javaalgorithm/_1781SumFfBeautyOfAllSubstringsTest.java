package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention", "SpellCheckingInspection"})
class _1781SumFfBeautyOfAllSubstringsTest {

    private final _1781SumFfBeautyOfAllSubstrings solution = new _1781SumFfBeautyOfAllSubstrings();

    @Test
    void beautySum() {
        String s = "aabcb";
        int result = solution.beautySum(s);
        Assertions.assertEquals(5, result);

        s = "aabcbaa";
        result = solution.beautySum(s);
        Assertions.assertEquals(17, result);
    }
}
