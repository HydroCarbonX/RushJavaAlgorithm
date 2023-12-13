package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2023-12-13
 */
public class _2697LexicographicallySmallestPalindrome {

    public String makeSmallestPalindrome(String s) {
        char[] charArray = s.toCharArray();

        int j = s.toCharArray().length - 1;
        for (int i = 0; i < s.toCharArray().length; i++, j--) {
            if (charArray[i] != charArray[j]) {
                charArray[i] = charArray[j] = (char) Math.min(charArray[i], charArray[j]);
            }
        }

        return new String(charArray);
    }
}
