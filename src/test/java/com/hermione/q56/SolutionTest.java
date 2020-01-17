package com.hermione.q56;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2020/1/15
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[][] params = new int[][] {
                {1, 3}, {2, 6}, {8, 10},{15, 18}
        };
        solution.merge(params);
    }

    @Test
    public void test2() {
        int[][] params = new int[][] {
                {1, 4}, {0, 0}
        };
        solution.merge(params);
    }
}
