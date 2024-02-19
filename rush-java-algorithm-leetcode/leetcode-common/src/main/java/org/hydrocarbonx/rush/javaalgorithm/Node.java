package org.hydrocarbonx.rush.javaalgorithm;

import java.util.List;

/**
 * @author zouzhenfeng
 * @since 2024-02-19
 */
@SuppressWarnings("all")
public class Node {

    public int val;

    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
