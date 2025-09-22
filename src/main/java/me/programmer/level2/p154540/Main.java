package me.programmer.level2.p154540;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
}
class Solution {
    int rows, cols;
    boolean[][] visited;
    String[] currentMaps;

    int[] dy = {-1, 1, 0, 0};
    int[] dx = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        rows = maps.length;
        cols = maps[0].length();
        visited = new boolean[rows][cols];
        currentMaps = maps;

        List<Integer> answer = new LinkedList<>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(currentMaps[i].charAt(j) != 'X' && !visited[i][j]) {
                    int sum = dfs(i, j);
                    answer.add(sum);
                }
            }
        }

        if(answer.isEmpty())
            return new int[]{-1};

        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public int dfs(int y, int x) {
        if(y < 0 || y >= rows || x < 0 || x >= cols
            || currentMaps[y].charAt(x) == 'X' || visited[y][x])
            return 0;

        visited[y][x] = true;

        int currentFood = currentMaps[y].charAt(x) - '0';

        for(int i = 0; i < 4; i++) {
            currentFood += dfs(y + dy[i], x + dx[i]);
        }
        return currentFood;
    }
}