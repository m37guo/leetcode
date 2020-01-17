package com.hermione.q69;

/**
 * 二分搜索
 * @author vermouth
 * @date 2020/1/2
 */
public class Solution {
    public int mySqrt(int x) {
        int s = 0, e = x / 2 + 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            long mul = (long)mid * (long)mid;
            if (mul == x) {
                return mid;
            } else if (mul < x) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        long mul = (long)s * (long)s;
        if (mul <= x) {
            return s;
        } else {
            return s - 1;
        }
    }
}