package com.hermione.q191;


import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/3/2
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void hammingWeight() {
        System.out.println(solution.hammingWeight(11));
    }

    @Test
    public void hammingWeight2() {
        System.out.println(solution.hammingWeight(-11));
    }
}