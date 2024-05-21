package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author Zou Zhenfeng
 * @since 2024-05-21
 */
public class Lcr099 {

    public int minPathSum(int[][] grid) {

        // 1. 确定状态
        // dp[i][j] 表示从左上角到 grid[i][j] 的最小路径和
        // 2. 确定状态转移方程
        // dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j]
        // 3. 确定初始条件
        // dp[0][0] = grid[0][0]
        // dp[0][j] = dp[0][j-1] + grid[0][j]
        // dp[i][0] = dp[i-1][0] + grid[i][0]
        // 4. 确定计算顺序
        // 从左到右，从上到下

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        // 初始化
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // 计算
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
