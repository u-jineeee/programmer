package me.programmer.level2.p169199;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
    int rows, cols;
    int[] dy = {-1, 1, 0, 0};
    int[] dx = {0, 0, -1, 1};
    public int solution(String[] board) {
        rows = board.length;
        cols = board[0].length();

        int startX = 0, startY = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                char c = board[i].charAt(j);
                if(c == 'R') {
                    startY = i;
                    startX = j;
                }
            }
        }

        return bfs(startX, startY, board);
    }
    public int bfs(int startX, int startY, String[] board) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        queue.add(new int[]{startY, startX, 0});
        visited[startY][startX] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int count = current[2];

            if(board[y].charAt(x) == 'G') {
                return count;
            }

            for(int i = 0; i < 4; i++){
                int nextY = y;
                int nextX = x;

                while(true) {
                    int ny = nextY + dy[i];
                    int nx = nextX + dx[i];

                    if(ny < 0 || ny >= rows || nx < 0 || nx >= cols || board[ny].charAt(nx) == 'D') {
                        break;
                    }
                    nextY = ny;
                    nextX = nx;
                }

                if(!visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextY, nextX, count + 1});
                }
            }
        }
        return -1;
    }
}