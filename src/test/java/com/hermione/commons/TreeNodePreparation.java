package com.hermione.commons;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class TreeNodePreparation {

    /**
     *
     * @return {@link TreeNode}
     *      1
     *        \
     *         2
     *        /
     *       3
     */
    public static TreeNode prepareTreeNode() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        return root;
    }
}
