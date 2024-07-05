package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author Zou Zhenfeng
 * @since 2024-07-05
 */
public class _3033 {

    public int[][] modifiedMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return matrix;
        }

        // 竖着迭代数组
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 1; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == -1) {
                    matrix[j][i] = max;
                }
            }
        }

        return matrix;
    }
}
