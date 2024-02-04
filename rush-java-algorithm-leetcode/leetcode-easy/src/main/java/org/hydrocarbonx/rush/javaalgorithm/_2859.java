package org.hydrocarbonx.rush.javaalgorithm;

import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2024-01-25
 */
public class _2859 {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        // 求出长度的置位

        int[] bits = new int[nums.size()];
        bits[0] = 0;
        for (int i = 1; i < nums.size(); i++) {
            int j = i;

            int count = 0;
            // 大于 0 的，那就一直 & 1，如果为 1 说明当前末尾是 1
            while (j > 0) {
                if ((j & 1) == 1) {
                    count++;
                }
                // 右移
                j = (j >> 1);
            }
            bits[i] = count;
        }

        int result = 0;
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == k) {
                result += nums.get(i);
            }
        }

        return result;
    }
}
