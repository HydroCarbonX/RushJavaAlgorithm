package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2024-01-22
 */
public class _670 {

    public int maximumSwap(int num) {
        // 转成 char 数组，方便处理
        char[] chars = String.valueOf(num).toCharArray();

        // 记录每个数字出现的最后一次出现的索引
        int[] last = new int[10];
        for (int i = 0; i < chars.length; i++) {
            last[chars[i] - '0'] = i;
        }

        // 从左向右扫描，找到当前位置右边的最大的数字并交换
        for (int i = 0; i < chars.length; i++) {
            for (int j = 9; j > chars[i] - '0'; j--) {
                if (last[j] > i) {
                    char tmp = chars[i];
                    chars[i] = chars[last[j]];
                    chars[last[j]] = tmp;
                    return Integer.parseInt(new String(chars));
                }
            }
        }
        return num;
    }
}
