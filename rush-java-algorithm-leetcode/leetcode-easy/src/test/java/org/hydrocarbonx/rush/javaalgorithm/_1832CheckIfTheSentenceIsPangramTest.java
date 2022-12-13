package org.hydrocarbonx.rush.javaalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S3577", "NewClassNamingConvention", "SpellCheckingInspection"})
class _1832CheckIfTheSentenceIsPangramTest {

    private final _1832CheckIfTheSentenceIsPangram solution = new _1832CheckIfTheSentenceIsPangram();

    @Test
    void checkIfPangram() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = solution.checkIfPangram(sentence);
        Assertions.assertTrue(result);

        sentence = "leetcode";
        result = solution.checkIfPangram(sentence);
        Assertions.assertFalse(result);
    }
}
