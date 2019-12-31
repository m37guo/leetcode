package com.hermione.q79;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vermouth
 * @date 2019/12/30
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void exist1() {
        char[][] board = {
                {'a', 'a'}
        };
        System.out.println(solution.exist(board, "aaa"));
    }

    @Test
    public void exist2() {
        char[][] board = {
                {'a', 'b'}
        };
        System.out.println(solution.exist(board, "ba"));
    }
}
