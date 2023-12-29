package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2023-12-29
 */
public class _2706 {

    public int buyChoco(int[] prices, int money) {

        // 第一块，最小
        int first = Integer.MAX_VALUE;
        // 第二块，第二小
        int second = Integer.MAX_VALUE;

        for (int price : prices) {
            // 比第一块的钱少
            if (price < first) {
                // 第二块的钱变成第一块的钱
                second = first;
                // 第一块的钱变成当前钱
                first = price;
            } else if (price < second) { // 比第二块的钱少，相当于在 [first, second) 区间
                // 第二块的钱变成当前钱
                second = price;
            }
        }

        // 小于 0 就买不了，否则就是差价
        return money - first - second < 0 ? money : money - first - second;
    }
}
