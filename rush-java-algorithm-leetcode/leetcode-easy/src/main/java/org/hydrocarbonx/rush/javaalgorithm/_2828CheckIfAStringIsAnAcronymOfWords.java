package org.hydrocarbonx.rush.javaalgorithm;

import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2023-12-20
 */
public class _2828CheckIfAStringIsAnAcronymOfWords {

    public boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            if (s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
