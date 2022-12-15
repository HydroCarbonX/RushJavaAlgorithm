package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S3577", "", "NewClassNamingConvention"})
class _1945SumOfDigitsOfStringAfterConvertTest {

    private final _1945SumOfDigitsOfStringAfterConvert solution = new _1945SumOfDigitsOfStringAfterConvert();

    @Test
    void getLucky() {
        @SuppressWarnings("SpellCheckingInspection")
        String s = "iiii";
        int k = 1;
        int result = solution.getLucky(s, k);
        Assertions.assertEquals(36, result);

        s = "leetcode";
        k = 2;
        result = solution.getLucky(s, k);
        Assertions.assertEquals(6, result);
    }
}
