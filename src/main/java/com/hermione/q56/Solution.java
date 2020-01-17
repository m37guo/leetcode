package com.hermione.q56;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author vermouth
 * @date 2020/1/15
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;

        List<Interval> inters = new ArrayList<>();
        for (int[] interval : intervals) {
            inters.add(new Interval(interval[0], interval[1]));
        }

        // 1. 先排序
        inters.sort(Comparator.comparingInt(i2 -> i2.start));

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = null;
        for (int i = 0; i < len; i++) {
            if (prev == null) {
                prev = new ArrayList<>();
                prev.add(inters.get(i).start);
                prev.add(inters.get(i).end);
                list.add(prev);
            } else {
                if (inters.get(i).start > prev.get(1)) {
                    List<Integer> current = new ArrayList<>();
                    current.add(inters.get(i).start);
                    current.add(inters.get(i).end);
                    list.add(current);
                    prev = current;
                } else {
                    int val = Math.max(inters.get(i).end, prev.get(1));
                    prev.set(1, val);
                }
            }
        }
        int[][] ret = new int[list.size()][2];
        int i = 0;
        for (List<Integer> l : list) {
            ret[i][0] = l.get(0);
            ret[i][1] = l.get(1);
            i++;
        }
        return ret;
    }

    class Interval {
        int start;
        int end;
        Interval (int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
