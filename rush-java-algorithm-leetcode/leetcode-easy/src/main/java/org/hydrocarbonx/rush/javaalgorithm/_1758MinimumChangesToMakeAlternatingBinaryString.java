package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S101"})
public class _1758MinimumChangesToMakeAlternatingBinaryString {

    /**
     * 将字符串 s 置为二进制交替字符串需要的最少操作次数
     *
     * @param s 源字符串
     * @return s 置为交替字符串需要的最少操作次数
     */
    public int minOperations(String s) {
        // 计数
        int count = 0;
        // 迭代字符串
        for (int i = 0; i < s.length(); i++) {
            // 当前位置的字符
            char c = s.charAt(i);
            /*
             * 因为假定是从 0 开始的
             * 判断当前位置的字符是否和符合的交替字符串改位置的字符相等
             * 如果不相等，就需要进行翻转
             */
            if (c != ('0' + i % 2)) {
                // 不相等，计数加一
                count++;
            }
        }
        // 取较小的值
        return Math.min(count, s.length() - count);
    }
}
