package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2024-01-23
 */
public class _2765 {

    public int alternatingSubarray(int[] nums) {
        int res = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int k = 1;
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[j - 1] == k) {
                    k *= -1;
                    count++;
                } else {
                    break;
                }
            }
            res = Math.max(res, count);
        }
        return res > 0 ? res + 1 : -1;
    }
}
