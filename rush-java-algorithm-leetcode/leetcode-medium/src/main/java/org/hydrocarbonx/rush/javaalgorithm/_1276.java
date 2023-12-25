package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Collections;
import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2023-12-21
 */
public class _1276 {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices * 2 || tomatoSlices > cheeseSlices * 4) {
            return Collections.emptyList();
        }

        int i = tomatoSlices - cheeseSlices * 2;

        if (i % 2 != 0) {
            return Collections.emptyList();
        } else {
            return List.of(i / 2, cheeseSlices - i / 2);
        }
    }
}
