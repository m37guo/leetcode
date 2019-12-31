package com.hermione.q90;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author vermouth
 * @date 2019/12/31
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        List<List<Integer>> ret = solution.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(ret);
    }
}
