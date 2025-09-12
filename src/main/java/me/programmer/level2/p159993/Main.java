package me.programmer.level2.p159993;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
    int rows, cols;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    public int solution(String[] maps) {
        rows = maps.length;
        cols = maps[0].length();

        int startX = 0, startY = 0;
        int leverX = 0, leverY = 0;
        int endX = 0, endY = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                char c = maps[i].charAt(j);
                if(c == 'S') {
                    startY = i;
                    startX = j;
                } else if(c == 'L') {
                    leverY = i;
                    leverX = j;
                } else if(c == 'E') {
                    endY = i;
                    endX = j;
                }
            }
        }

        int timeToLever = bfs(startX, startY, leverX, leverY, maps);
        if(timeToLever == -1) {
            return -1;
        }

        int timeToEnd = bfs(leverX, leverY, endX, endY, maps);
        if(timeToEnd == -1) {
            return -1;
        }

        return timeToLever + timeToEnd;
    }
    public int bfs(int startX, int startY, int endX, int endY, String[] maps) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        queue.add(new int[]{startY, startX, 0});
        visited[startY][startX] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int time = current[2];

            if(y == endY && x == endX) {
                return time;
            }

            for(int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                if(nextY >= 0 && nextY < rows && nextX >= 0 && nextX < cols
                && maps[nextY].charAt(nextX) != 'X' && !visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextY, nextX, time+1});
                }
            }
        }
        return -1;
    }
}