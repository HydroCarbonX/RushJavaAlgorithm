package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
public class _2278 {

    public int percentageLetter(String s, char letter) {

        if (s.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (letter == ch) {
                count++;
            }
        }

        return count * 100 / s.length();
    }
}
