package com.hermione.q71;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void testSimplifyPath1() {
        System.out.println(solution.simplifyPath("/home/"));
    }

    @Test
    public void testSimplifyPath2() {
        System.out.println(solution.simplifyPath("/home//foo"));
    }
}
