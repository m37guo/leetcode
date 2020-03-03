package com.hermione.q191;

/**
 * @author vermouth
 * @date 2020/3/2
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        if (n < 0) {
            count = 1;
            n = Integer.MAX_VALUE + n + 1;
        }
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
}
