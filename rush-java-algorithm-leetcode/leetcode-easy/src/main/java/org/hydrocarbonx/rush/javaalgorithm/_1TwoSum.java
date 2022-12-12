package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author HydroCarbon
 */
@SuppressWarnings("java:S101")
public class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
         * 两层迭代，暴力枚举
         * 判断是否存在两数之和等于目标值的
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // 返回对应的索引数组
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
