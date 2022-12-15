package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings("java:S101")
public class _1945SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {
        int result = 0;
        // 迭代处理每一个字符
        for (char c : s.toCharArray()) {
            // 字符代表的数
            int value = c - 'a' + 1;
            // 计算，因为 k >= 1 的
            // 得到的是第一次累计的
            result += sumOfBit(value);
        }
        // 计算剩下的累计的结果
        while (--k > 0) {
            result = sumOfBit(result);
        }
        return result;
    }

    /**
     * 使用对 10 进行取模和取整的操作，不断计算累计的每一位的值
     *
     * @param value 要计算的原始值
     * @return 累加值
     */
    private int sumOfBit(int value) {
        int result = 0;
        // 除以 10 取整不为 0
        while (value / 10 != 0) {
            // 除以 10 取余累加到 result
            result += value % 10;
            // 取整并更新数
            value /= 10;
        }
        // 累加得到结果
        return result + value;
    }
}
