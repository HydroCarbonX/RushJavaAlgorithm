package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zhenfeng.zou
 */
@SuppressWarnings({"java:S101", "java:S1643"})
public class _1668MaximumRepeatingSubstring {

  public int maxRepeating(String sequence, String word) {
    int sequenceLength = sequence.length();
    int wordLength = word.length();
    // 边界值判断
    if (sequenceLength < wordLength) {
      return 0;
    }
    if (sequenceLength == wordLength) {
      return sequence.equals(word) ? 1 : 0;
    }

    // 初始结果为 0
    int result = 0;
    // 当前 word
    String curWord = word;
    // 跳出条件为长度超出了序列的长度
    while (curWord.length() <= sequenceLength) {
      // 说明是包含的
      if (sequence.contains(curWord)) {
        ++result;
      } else {
        // 不包含可以直接返回结果了
        return result;
      }
      curWord += word;
    }
    // 返回最终的结果
    return result;
  }
}
