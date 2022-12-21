package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author HydroCarbon
 */
@SuppressWarnings("java:S101")
public class _1753MaximumScoreFromRemovingStones {

    /**
     * 最佳的策略是每次都去取最大的两个堆进行拿取。
     * 那么当一个堆大于其他两个堆之和的时候，
     * 最优解就是两个较小堆之和。
     * <p>
     * 不存在如上的关系的时候，三个堆拿到最后肯定是
     * 0   0   0 或者 0    0    1
     * 的排列。
     * 因为每次拿 2 个，所以这个时候的最优解就是三个堆
     * 之和对 2 进行取整。
     *
     * @param a 第一个堆的数量
     * @param b 第二个堆的数量
     * @param c 第三个堆的数量
     * @return 最优解
     */
    public int maximumScore(int a, int b, int c) {
        if (a > b + c) {
            return b + c;
        }
        if (b > a + c) {
            return a + c;
        }
        if (c > a + b) {
            return a + b;
        }
        return (a + b + c) / 2;
    }
}
