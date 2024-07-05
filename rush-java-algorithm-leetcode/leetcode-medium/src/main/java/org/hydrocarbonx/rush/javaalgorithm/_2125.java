package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
public class _2125 {

    public int numberOfBeams(String[] bank) {
        if (bank.length <= 1) {
            return 0;
        }

        int[] numOfLine = new int[bank.length];
        int preCount = 0;
        int result = 0;
        for (int i = 0; i < bank.length; i++) {

            for (char ch : bank[i].toCharArray()) {
                if ('1' == ch) {
                    numOfLine[i]++;
                }
            }

            if (numOfLine[i] > 0) {
                result += preCount * numOfLine[i];
                preCount = numOfLine[i];
            }
        }

        return result;
    }
}
