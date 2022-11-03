package org.hydrocarbonx.rush.javaalgorithm;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhenfeng.zou
 */
@Slf4j
@SuppressWarnings("java:S101")
public class _1922MaximumRepeatingSubstring {
  public int arraySign(int[] nums) {
    // 初始化的结果为 1
    int result = 1;
    // 迭代每一个数字
    for (int num : nums) {
      // 只要遇到了 0，那就应该直接 return
      if (num == 0) {
        return 0;
      }
      // 如果遇到的值是小于 0 的，就应该对结果取负
      if (num < 0) {
        result = -result;
      }
    }
    // 最终的结果
    return result;
  }
}
