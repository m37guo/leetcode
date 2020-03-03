package com.hermione.q144;

import com.google.common.collect.Lists;
import com.hermione.commons.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class Solution {

    private static class Pair {
        /**
         * 如果visited为true，则把当前节点加入List中；
         * 否则按一定的顺序将当前节点和左右子节点分别加入List中。
         */
        boolean visited;
        TreeNode node;
        Pair (boolean visited, TreeNode node) {
            this.visited = visited;
            this.node = node;
        }
    }

    /**
     * 前序遍历
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> ret = Lists.newArrayList();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(false, root));
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            if (pair.node == null) {
                continue;
            }
            if (pair.visited) {
                ret.add(pair.node.val);
            } else {
                if (pair.node.right != null) {
                    stack.push(new Pair(false, pair.node.right));
                }
                if (pair.node.left != null) {
                    stack.push(new Pair(false, pair.node.left));
                }
                stack.push(new Pair(true, pair.node));
            }
        }
        return ret;
    }

    /**
     * 中序遍历
     */
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> ret = Lists.newArrayList();
        if (root == null) {
            return ret;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(false, root));
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            TreeNode node = pair.node;
            if (pair.visited) {
                ret.add(node.val);
            } else {
                // 遇到不同的遍历只需要调整这里的顺序即可
                // 这里添加顺序和递归调用时的顺序是相反的。
                if (node.right != null) {
                    stack.push(new Pair(false, node.right));
                }
                stack.push(new Pair(true, node));
                if (node.left != null) {
                    stack.push(new Pair(false, node.left));
                }
            }
        }
        return ret;
    }

    /**
     * 后序遍历
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> ret = Lists.newArrayList();
        if (root == null) {
            return ret;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(false, root));
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            TreeNode node = pair.node;
            if (pair.visited) {
                ret.add(node.val);
            } else {
                stack.push(new Pair(true, node));
                if (node.right != null) {
                    stack.push(new Pair(false, node.right));
                }
                if (node.left != null) {
                    stack.push(new Pair(false, node.left));
                }
            }
        }
        return ret;
    }
}
