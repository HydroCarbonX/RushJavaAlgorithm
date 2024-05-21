package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-21
 */
class _2769Test {

    private final _2769 solution = new _2769();

    @Test
    void theMaximumAchievableX_HappyPath() {
        int num = 5;
        int t = 3;
        int result = solution.theMaximumAchievableX(num, t);
        Assertions.assertEquals(11, result);
    }

    @Test
    void theMaximumAchievableX_ZeroT() {
        int num = 5;
        int t = 0;
        int result = solution.theMaximumAchievableX(num, t);
        Assertions.assertEquals(5, result);
    }
}
