package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Arrays;

/**
 * @author zouzhenfeng
 * @since 2024-01-18
 */
public class _2171 {

    public long minimumRemoval(int[] beans) {
        long result = Long.MAX_VALUE;
        for (int bean : beans) {

            long count = 0;
            for (int i : beans) {
                if (i < bean) {
                    count += i;
                } else if (i > bean) {
                    count += i - bean;
                }
            }
            result = Math.min(result, count);
        }
        return result;
    }
}
