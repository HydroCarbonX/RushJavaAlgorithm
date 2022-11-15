package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Arrays;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S101", "java:S1643"})
public class _1710MaximumUnitsOnATruck {

  /**
   * 首先将 boxTypes 进行自定义排序，按照每个数组的第二个元素进行降序排序。
   *
   * @param boxTypes 盒子类型以及单元数量
   * @param truckSize 卡车能装的盒子数量
   * @return 卡车能装的最大单元总数
   */
  public int maximumUnits(int[][] boxTypes, int truckSize) {
    // 按照降序对二维数组中的每个项的第二个元素进行排序
    Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
    // 以及存放的大小
    int size = 0;
    // 结果
    int result = 0;
    for (int[] boxType : boxTypes) {
      // 能全部装下
      if (boxType[0] < truckSize - size) {
        result += boxType[0] * boxType[1];
        size += boxType[0];
      } else {
        // 不能全部装下，就按照还能装几个来处理。
        result += boxType[1] * (truckSize - size);
        // 这时候已经装满了可以直接返回结果了
        return result;
      }
    }
    return result;
  }
}
