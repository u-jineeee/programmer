package me.programmer.level0.p120866;

public class Main {
}
class Solution {
	public int solution(int[][] board) {
		int answer = board.length * board.length;
		int[][] safe = new int[board.length][board.length];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] == 1) {
					safe[i][j] = -1;
					if(i-1 >= 0 && j-1 >= 0)
						safe[i-1][j-1] = -1;
					if(i-1 >= 0)
						safe[i-1][j] = -1;
					if(i-1 >= 0 && j+1 < board.length)
						safe[i-1][j+1] = -1;
					if(j-1 >= 0)
						safe[i][j-1] = -1;
					if(j+1 < board.length)
						safe[i][j+1] = -1;
					if(i+1 < board.length && j-1 >= 0)
						safe[i+1][j-1] = -1;
					if(i+1 < board.length)
						safe[i+1][j] = -1;
					if(i+1 < board.length && j+1 < board.length)
						safe[i+1][j+1] = -1;
				}
			}
		}

		for(int[] x : safe) {
			for(int y : x) {
				if(y == -1)
					answer--;
			}
		}
		return answer;
	}
}