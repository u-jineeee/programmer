package me.programmer.level2.p77485;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        int[][] board = new int[rows][columns];
        int n = 1;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                board[i][j] = n++;
            }
        }

        for (int[] query : queries) {
            int y1 = query[0] - 1;
            int x1 = query[1] - 1;
            int y2 = query[2] - 1;
            int x2 = query[3] - 1;

            int temp = board[y1][x1];
            int min = temp;
            for(int i = y1; i < y2; i++) {
                int x = board[i+1][x1];
                board[i][x1] = x;
                if(min > x) min = x;
            }

            for(int i = x1; i < x2; i++) {
                int x = board[y2][i+1];
                board[y2][i] = x;
                if(min > x) min = x;
            }

            for(int i = y2; i > y1; i--) {
                int x = board[i-1][x2];
                board[i][x2] = x;
                if(min > x) min = x;
            }

            for(int i = x2; i > x1; i--) {
                int x = board[y1][i-1];
                board[y1][i] = x;
                if(min > x) min = x;
            }

            board[y1][x1+1] = temp;
            answer.add(min);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}