package org.hydrocarbonx.rush.javaalgorithm;

import java.util.*;

/**
 * @author zouzhenfeng
 * @since 2024-01-10
 */
public class _2696 {

    public int minLength(String s) {
        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (list.isEmpty()) {
                list.add(c);
            } else {
                if (c == 'B' && list.getLast() == 'A') {
                    list.removeLast();
                } else if (c == 'D' && list.getLast() == 'C') {
                    list.removeLast();
                } else {
                    list.add(c);
                }
            }
        }

        return list.size();
    }
}
