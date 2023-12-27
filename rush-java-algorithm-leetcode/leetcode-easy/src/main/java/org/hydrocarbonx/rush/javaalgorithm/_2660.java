package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2023-12-27
 */
public class _2660 {

    public int isWinner(int[] player1, int[] player2) {

        int player1Sum = sum(player1);
        int player2Sum = sum(player2);

        if (player1Sum == player2Sum) {
            return 0;
        }

        return player1Sum > player2Sum ? 1 : 2;
    }

    private int sum(int[] player) {
        if (player == null || player.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < player.length; i++) {
            if ((i > 0 && player[i - 1] == 10)
                    || (i > 1 && player[i - 2] >= 10)) {
                sum += 2 * player[i];
            } else {
                sum += player[i];
            }
        }
        return sum;
    }
}
