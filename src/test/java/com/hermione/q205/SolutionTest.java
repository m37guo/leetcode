package com.hermione.q205;

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
    public void testIsIsomorphic1() {
        System.out.println(solution.isIsomorphic("aa", "ab"));
    }
}
