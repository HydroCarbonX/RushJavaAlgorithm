package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S3577", "SpellCheckingInspection", "NewClassNamingConvention"})
class _1668MaximumRepeatingSubstringTest {

  private final _1668MaximumRepeatingSubstring solution = new _1668MaximumRepeatingSubstring();

  @Test
  void maxRepeating() {
    String sequence = "ababc";
    String word = "ab";
    int result = solution.maxRepeating(sequence, word);
    Assertions.assertEquals(2, result);

    sequence = "ababc";
    word = "ba";
    result = solution.maxRepeating(sequence, word);
    Assertions.assertEquals(1, result);

    sequence = "ababc";
    word = "ac";
    result = solution.maxRepeating(sequence, word);
    Assertions.assertEquals(0, result);
  }
}
