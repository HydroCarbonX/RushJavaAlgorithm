package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention"})
class _1710MaximumUnitsOnATruckTest {
  private static final _1710MaximumUnitsOnATruck solution = new _1710MaximumUnitsOnATruck();

  @Test
  void maximumUnits() {
    int[][] boxTypes = new int[][] {{1, 3}, {2, 2}, {3, 1}};
    int result = solution.maximumUnits(boxTypes, 4);
    Assertions.assertEquals(8, result);

    boxTypes = new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
    result = solution.maximumUnits(boxTypes, 10);
    Assertions.assertEquals(91, result);
  }
}
