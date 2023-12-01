package org.hydrocarbonx.rush.javaalgorithm;

import java.sql.ResultSet;

/**
 * @author zouzhenfeng
 * @since 2023-11-27
 */
public class _907SumOfSubarrayMinimums {

    public static void main(String[] args) {

        int[] arr = {11, 81, 94, 43, 3};

        new _907SumOfSubarrayMinimums().sumSubarrayMins(arr);
    }

    public int sumSubarrayMins(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int min = arr[j];
                for (int k = i; k < j; k++) {
                    min = Math.min(min, arr[k]);
                }
                sum += min;
                sum %= 1000000007;
            }
        }

        return sum;
    }
}
