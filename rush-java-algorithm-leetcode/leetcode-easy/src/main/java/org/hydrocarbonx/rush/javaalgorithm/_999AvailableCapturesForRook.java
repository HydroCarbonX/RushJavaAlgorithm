package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2023-11-22
 */
public class _999AvailableCapturesForRook {

    public int numRookCaptures(char[][] board) {

        int result = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 找到车
                if ('R' == board[i][j]) {
                    // 向上
                    int up = i - 1;
                    while (up >= 0) {
                        if ('B' == board[up][j]) {
                            break;
                        }
                        if ('p' == board[up][j]) {
                            result++;
                            break;
                        }
                        up--;
                    }

                    // 向下
                    int down = i + 1;
                    while (down < board.length) {
                        if ('B' == board[down][j]) {
                            break;
                        }
                        if ('p' == board[down][j]) {
                            result++;
                            break;
                        }
                        down++;
                    }

                    // 向左
                    int left = j - 1;
                    while (left >= 0) {
                        if ('B' == board[i][left]) {
                            break;
                        }
                        if ('p' == board[i][left]) {
                            result++;
                            break;
                        }
                        left--;
                    }

                    // 向右
                    int right = j + 1;
                    while (right < board[i].length) {
                        if ('B' == board[i][right]) {
                            break;
                        }
                        if ('p' == board[i][right]) {
                            result++;
                            break;
                        }
                        right++;
                    }
                    break;
                }
            }
        }
        return result;
    }
}
