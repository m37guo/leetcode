package com.hermione.q144;

import com.hermione.commons.TreeNode;
import com.hermione.commons.TreeNodePreparation;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class SolutionTest {
    private Solution solution;
    private TreeNode root;

    @Before
    public void init() {
        this.solution = new Solution();
        this.root = TreeNodePreparation.prepareTreeNode();
    }

    @Test
    public void testPreorderTraversal() {
        System.out.println(solution.preOrderTraversal(root));
        // [1, 2, 3]
    }

    @Test
    public void testInOrderTraversal() {
        System.out.println(solution.inOrderTraversal(root));
        // [1, 3, 2]
    }

    @Test
    public void testPostOrderTraversal() {
        System.out.println(solution.postOrderTraversal(root));
        // [3, 2, 1]
    }
}
