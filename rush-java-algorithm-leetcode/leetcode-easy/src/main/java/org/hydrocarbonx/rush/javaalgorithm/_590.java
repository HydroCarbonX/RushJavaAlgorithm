package org.hydrocarbonx.rush.javaalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2024-02-19
 */
public class _590 {

    public List<Integer> postorder(Node root) {
        var result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        helper(root, new ArrayList<>());

        return result;
    }

    public void helper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        for (Node ch : root.children) {
            helper(ch, result);
        }
        result.add(root.val);
    }
}
