package com.hermione.question54;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;                            // 上边界
        int down = matrix.length - 1;           // 下边界
        int left = 0;                           // 左边界
        int right = matrix[0].length - 1;       // 右边界

        // 指定指针的下一个方向
        int[] direction = new int[]{0, 1};
        List<Integer> ret = new ArrayList<>();

        int row = 0, column = 0;

        int count = (down + 1) * (right + 1);
        while (count > 0) {
            ret.add(matrix[row][column]);
            count--;
            // 坐标沿着方向改变
            row += direction[0];
            column += direction[1];

            if (row == top && column == right && direction[1] == 1) {
                // 到达右上角，方向改为向下，同时让上边界+1
                // 注意一定要加上方向这个条件，否则会出现这种情况：
                // 到达右上角时，此时应该row+1，此时top也+1了，
                // 因此下一次循环是， row == top && column == right 仍然成立
                direction[0] = 1;
                direction[1] = 0;
                top++;
            } else if (row == down && column == right && direction[0] == 1) {
                // 到达右下角，方向改为向左，同时让右边界+1
                direction[0] = 0;
                direction[1] = -1;
                right--;
            } else if (row == down && column == left && direction[1] == -1) {
                // 到达左下角，方向改为向上，同时让下边界-1
                direction[0] = -1;
                direction[1] = 0;
                down--;
            } else if (row == top && column == left && direction[0] == -1) {
                // 到达左上角，方向改为向右，同时让左边界+1
                direction[0] = 0;
                direction[1] = 1;
                left++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(matrix));
    }
}
