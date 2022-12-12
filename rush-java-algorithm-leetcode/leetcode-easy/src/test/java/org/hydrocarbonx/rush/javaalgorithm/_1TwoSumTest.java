package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention"})
class _1TwoSumTest {

    private final _1TwoSum solution = new _1TwoSum();

    @Test
    void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);

        nums = new int[]{3, 3};
        result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }
}
