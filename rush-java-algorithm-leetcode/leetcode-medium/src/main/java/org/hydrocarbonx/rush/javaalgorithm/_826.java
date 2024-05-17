package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-17
 */
public class _826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Map<Integer, Integer> map = new HashMap<>();

        // 1. 将难度和收益对应起来，难度相同的收益取最大值
        for (int i = 0; i < difficulty.length; i++) {
            map.put(difficulty[i], Math.max(map.getOrDefault(difficulty[i], 0), profit[i]));
        }

        // 2. 将难度和收益按照难度排序
        Arrays.sort(difficulty);

        // 3. 将工人的能力按照从小到大排序
        Arrays.sort(worker);

        // 4. 遍历工人的能力，找到每个工人能完成的最大收益
        int res = 0;
        for (int w : worker) {
            int max = 0;
            for (int d : difficulty) {
                if (d > w) {
                    break;
                }
                max = Math.max(max, map.getOrDefault(d, max));
            }
            res += max;
        }
        return res;
    }
}
