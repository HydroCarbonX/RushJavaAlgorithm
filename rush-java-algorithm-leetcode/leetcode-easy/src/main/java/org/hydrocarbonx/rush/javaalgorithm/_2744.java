package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zouzhenfeng
 * @since 2024-01-17
 */
public class _2744 {

    public int maximumNumberOfStringPairs(String[] words) {
        var set = new HashSet<String>(Arrays.asList(words));

        var result = 0;
        for (var word : words) {
            var reverseWord = new StringBuilder(word).reverse().toString();

            if (set.contains(reverseWord) && !word.equals(reverseWord)) {
                result++;
                set.remove(reverseWord);
            }
        }

        return result / 2;
    }
}
