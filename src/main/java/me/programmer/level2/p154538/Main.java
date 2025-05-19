package me.programmer.level2.p154538;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
	public int solution(int x, int y, int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[1000001];

		queue.add(new int[]{x, 0});
		visited[x] = true;

		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			if(current[0] == y)
				return current[1];
			int[] next = {current[0] + n, current[0] * 2, current[0] * 3};
			for(int a : next) {
				if(a <= y && !visited[a]) {
					visited[a] = true;
					queue.add(new int[] {a, current[1] + 1});
				}
			}
		}
		return -1;
	}
}