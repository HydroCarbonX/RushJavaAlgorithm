package org.hydrocarbonx.rush.javaalgorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author HydroCarbon
 */
@SuppressWarnings({"java:S101", "SpellCheckingInspection"})
public class _1832CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        // 用一个 Set 记录大小
        Set<Character> set = new HashSet<>(16);
        // 迭代每一个字符，将其加入到 set 中
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        // 如果 set 的大小大于 26，说明都出现过
        return set.size() == 26;
    }
}
