package org.hydrocarbonx.rush.javaalgorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouzhenfeng
 * @since 2023-12-01
 */
public class _2661FirstCompletelyPaintedRowOrColumn {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        int[] c1 = new int[n];
        int[] c2 = new int[m];
        for (int i = 0; i < n * m; i++) {
            int[] info = map.get(arr[i]);
            int x = info[0];
            int y = info[1];
            if (++c1[x] == m || ++c2[y] == n) {
                return i;
            }
        }
        return -1; // never
    }
}
