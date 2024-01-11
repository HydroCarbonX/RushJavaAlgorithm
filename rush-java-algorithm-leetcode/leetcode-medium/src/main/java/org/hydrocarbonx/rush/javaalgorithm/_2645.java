package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2024-01-11
 */
public class _2645 {

    public int addMinimum(String word) {
        if (word.length() == 1) {
            return 2;
        }

        // aa, ab, ac, ba, bb, bc, ca, cb, cc

        // 0 -> +2
        // 1 -> +0
        // 2 -> +1
        // -1 -> +1
        // -2 -> +0

        int result = 0;
        for (int i = 0; i < word.toCharArray().length - 1; i++) {
            int diff = word.charAt(i + 1) - word.charAt(i);
            if (diff == 0) {
                result += 2;
            } else if (diff == 2 || diff == -1) {
                result += 1;
            }
        }

        // 第一个字符 - 'a'
        // a,b,c
        // +0,+1,+2
        result += word.charAt(0) - 'a';

        // 最后一个字符 - 'c'
        result += 'c' - word.charAt(word.length() - 1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _2645().addMinimum("abc"));
        System.out.println(new _2645().addMinimum("aabaa"));
    }
}
