package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author HydroCarbon
 */
@SuppressWarnings("java:S101")
public class _1781SumFfBeautyOfAllSubstrings {

    public int beautySum(String s) {
        // 记录长度
        int length = s.length();
        // 结果
        int result = 0;
        for (int i = 0; i < length; i++) {
            // 数组保存每一位出现的次数(a-z)，因为只包含小写字母
            int[] h = new int[26];
            // 内层迭代，得到每一个子串
            for (int j = i; j < length; j++) {
                // 字母对应的位置的值自增
                h[s.charAt(j) - 'a']++;
                // 最大值，最小值记录
                int max = 0;
                int min = length;
                // 迭代计算数组，得到最大值和最小值
                for (int k = 0; k < 26; k++) {
                    if (h[k] != 0) {
                        max = Math.max(max, h[k]);
                        min = Math.min(min, h[k]);
                    }
                }
                // 结果增加
                result += max - min;
            }
        }
        return result;
    }
}
