package com.hermione.q69;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/1/2
 */

public class SolutionTest {
    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void mySqrt() {
        System.out.println(solution.mySqrt(2147395599));
    }

    @Test
    public void mySqrt2() {
        System.out.println(solution.mySqrt(2147483647));
    }
}
