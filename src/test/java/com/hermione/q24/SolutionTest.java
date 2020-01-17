package com.hermione.q24;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/1/11
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void testSwapPairs() {
        Solution.ListNode l1 = new Solution.ListNode(1);
        Solution.ListNode l2 = new Solution.ListNode(2);
        Solution.ListNode l3 = new Solution.ListNode(3);
        Solution.ListNode l4 = new Solution.ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        Solution.ListNode head = solution.swapPairs(l1);
        Assert.assertEquals("2 -> 1 -> 4 -> 3", head.toString());
    }
}
