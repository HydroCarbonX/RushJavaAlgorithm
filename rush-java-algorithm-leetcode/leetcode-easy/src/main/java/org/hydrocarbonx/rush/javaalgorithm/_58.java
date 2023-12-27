package org.hydrocarbonx.rush.javaalgorithm;

public class _58 {

    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                ++len;
            } else if (len > 0) {
                break;
            }
        }
        return len;
    }
}
