package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention"})
class _1922MaximumRepeatingSubstringTest {

  private final _1922MaximumRepeatingSubstring solution = new _1922MaximumRepeatingSubstring();

  @Test
  void arraySign() {
    int[] nums = new int[] {-1, -2, -3, -4, 3, 2, 1};
    int result = solution.arraySign(nums);
    Assertions.assertEquals(1, result);

    nums = new int[] {1, 5, 0, 2, -3};
    result = solution.arraySign(nums);
    Assertions.assertEquals(0, result);

    nums = new int[] {-1, 1, -1, 1, -1};
    result = solution.arraySign(nums);
    Assertions.assertEquals(-1, result);
  }
}
