package me.programmer.level2.p87946;

public class Main {
}
class Solution {
	static int maxCnt = 0;
	public int solution(int k, int[][] dungeons) {
		boolean[] visited = new boolean[dungeons.length];
		dfs(k, dungeons, visited, 0);
		return maxCnt;
	}
	public void dfs(int fatigue, int[][] dungeons, boolean[] visited, int cnt) {
		maxCnt = Math.max(cnt, maxCnt);
		for(int i = 0; i < dungeons.length; i++) {
			if(!visited[i] && fatigue >= dungeons[i][0]) {
				visited[i] = true;
				dfs(fatigue - dungeons[i][1], dungeons, visited, cnt + 1);
				visited[i] = false;
			}
		}
	}
}