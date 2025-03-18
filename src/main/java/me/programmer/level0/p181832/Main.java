package me.programmer.level0.p181832;

public class Main {
}
class Solution {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int cnt = 1;
		int x = 0;
		while(cnt <= n*n) {
			for(int i = x; i < n-x; i++)
				answer[x][i] = cnt++;
			for(int i = x+1; i < n-x; i++)
				answer[i][n-x-1] = cnt++;
			for(int i = n-x-2; i >= x; i--)
				answer[n-x-1][i] = cnt++;
			for(int i = n-x-2; i > x; i--)
				answer[i][x] = cnt++;
			x++;
		}
		return answer;
	}
}