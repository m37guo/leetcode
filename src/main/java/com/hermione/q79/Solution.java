package com.hermione.q79;

/**
 * @author vermouth
 * @date 2019/12/30
 */
public class Solution {
    /**
     * 定义四个方向：右、下、左、上
     */
    private int[][] directions = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };


    public boolean exist(char[][] board, String word) {
        int height = board.length;
        if (height == 0) {
            return false;
        }
        int weight = board[0].length;

        // 代表哪个坐标被当前的dfs访问过
        boolean[][] visited = new boolean[height][weight];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (backtrace(board, visited, i, j, 0, word, height, weight)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrace(char[][] board, boolean[][] visited, int row, int column, int index, String word, int height, int weight) {
        if (index == word.length() - 1) {
            return board[row][column] == word.charAt(index);
        }
        if (board[row][column] == word.charAt(index)) {
            visited[row][column] = true;
            for (int i = 0; i < 4; i++) {
                int newRow = row + directions[i][0];
                int newColumn = column + directions[i][1];
                if (newRow < 0 || newColumn < 0 || newRow >= height || newColumn >= weight || visited[newRow][newColumn]) {
                    continue;
                }
                boolean ret = backtrace(board, visited, newRow, newColumn, index + 1, word, height, weight);
                if (ret) {
                    return true;
                }
            }
            visited[row][column] = false;
        }
        return false;
    }
}
