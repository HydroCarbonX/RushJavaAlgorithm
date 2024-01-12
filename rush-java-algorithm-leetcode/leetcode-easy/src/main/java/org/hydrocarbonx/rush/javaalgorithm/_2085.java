package org.hydrocarbonx.rush.javaalgorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zouzhenfeng
 * @since 2024-01-12
 */
public class _2085 {

    // leetcode 2085
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1000);
        }

        int result = 0;
        for (Integer value : map.values()) {
            if (value == 1001) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _2085 solution = new _2085();
        System.out.println(solution.countWords(new String[]{"leetcode", "is", "amazing", "as", "is"},
                new String[]{"amazing", "leetcode", "is"}));
    }
}
