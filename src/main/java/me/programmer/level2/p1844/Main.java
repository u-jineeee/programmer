package me.programmer.level2.p1844;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
	public int solution(int[][] maps) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};

		queue.add(new int[]{0, 0, 1});
		visited[0][0] = true;
		while(!queue.isEmpty()) {
			int[] position = queue.poll();
			int r = position[0];
			int c = position[1];
			int dist = position[2];

			if(r == maps.length - 1 && c == maps[0].length - 1)
				return dist;

			for(int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];

				if (nr >= 0 && nr < maps.length && nc >= 0 && nc < maps[0].length
					&& maps[nr][nc] == 1 && !visited[nr][nc]) {

					visited[nr][nc] = true;
					queue.add(new int[]{nr, nc, dist + 1});
				}
			}
		}
		return -1;
	}
}