package org.hydrocarbonx.rush.javaalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HydroCarbon
 * @since 2024-01-14
 */
public class _2788 {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        var result = new ArrayList<String>();

        for (String word : words) {
            var split = word.split("\\" + separator);
            for (String s : split) {
                if (!s.isEmpty()) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}
