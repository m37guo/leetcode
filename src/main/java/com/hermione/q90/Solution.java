package com.hermione.q90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vermouth
 * @date 2019/12/31
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        subsets(ret, new ArrayList<>(), 0, nums, nums.length);
        return ret;
    }

    public void subsets(List<List<Integer>> ret, List<Integer> inner, int start, int[] nums, int len) {
        ret.add(new ArrayList<>(inner));
        for (int i = start; i < len; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            inner.add(nums[i]);
            subsets(ret, inner, i + 1, nums, len);
            inner.remove(inner.size() - 1);
        }
    }
}
