package org.hydrocarbonx.rush.javaalgorithm;

import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2024-01-24
 */
public class _2865 {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res = 0;

        // 暴力迭代
        for (int i = 0; i < n; i++) {
            int pre = maxHeights.get(i);
            long sum = pre;
            for (int j = i - 1; j >= 0; j--) {
                pre = Math.min(pre, maxHeights.get(j));
                sum += pre;
            }
            int suf = maxHeights.get(i);
            for (int j = i + 1; j < n; j++) {
                suf = Math.min(suf, maxHeights.get(j));
                sum += suf;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
