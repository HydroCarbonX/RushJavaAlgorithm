package org.hydrocarbonx.rush.javaalgorithm;

/**
 * 一开始，你的银行账户里有 100 块钱。
 * <p>
 * 给你一个整数purchaseAmount ，它表示你在一次购买中愿意支出的金额。
 * <p>
 * 在一个商店里，你进行一次购买，实际支出的金额会向 最近 的 10 的 倍数 取整。换句话说，你实际会支付一个 非负 金额 roundedAmount ，满足 roundedAmount 是 10 的倍数且 abs(roundedAmount - purchaseAmount) 的值 最小 。
 * <p>
 * 如果存在多于一个最接近的 10 的倍数，较大的倍数 是你的实际支出金额。
 * <p>
 * 请你返回一个整数，表示你在愿意支出金额为 purchaseAmount 块钱的前提下，购买之后剩下的余额。
 * <p>
 * 注意： 0 也是 10 的倍数。
 *
 * @author Zou Zhenfeng
 * @since 2024-06-12
 */
public class _2806 {

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        // 如果一个数 + 5 除以 10 取整，再乘以 10，就是最近的 10 的倍数
        // 小于 x5 的数，向下取整，大于等于 x5 的数，向上取整
        // purchaseAmount + 5 除以 10 取整，再乘以 10，就是最近的 10 的倍数
        // 100 - (purchaseAmount + 5) / 10 * 10，就是购买之后剩下的余额
        return 100 - (purchaseAmount + 5) / 10 * 10;
    }
}
