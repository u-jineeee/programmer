package me.programmer.level2.p17679;

import java.util.Stack;

public class Main {
}
class Solution {
	public int solution(int m, int n, String[] board) {
		int answer = 0;
		char[][] charBoard = new char[m][n];

		for(int i = 0; i < m; i++)
			charBoard[i] = board[i].toCharArray();

		while(true) {
			boolean[][] toDelete = new boolean[m][n];
			int cntForTrue = 0;

			for(int i = 0; i < m - 1; i++) {
				for(int j = 0; j < n - 1; j++) {
					char currentBolck = charBoard[i][j];
					if(currentBolck == '0')
						continue;

					if(currentBolck == charBoard[i][j+1] &&
						currentBolck == charBoard[i+1][j] &&
						currentBolck == charBoard[i+1][j+1]) {
						toDelete[i][j] = true;
						toDelete[i][j+1] = true;
						toDelete[i+1][j] = true;
						toDelete[i+1][j+1] = true;
					}
				}
			}
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(toDelete[i][j]) {
						cntForTrue++;
						charBoard[i][j] = '0';
					}
				}
			}
			if(cntForTrue == 0)
				break;
			answer += cntForTrue;

			for(int j = 0; j < n; j++) {
				Stack<Character> stack = new Stack<>();
				for(int i = 0; i < m; i++) {
					if(charBoard[i][j] != '0')
						stack.push(charBoard[i][j]);
				}
				for(int i = m-1; i >= 0; i--) {
					if(!stack.isEmpty())
						charBoard[i][j] = stack.pop();
					else
						charBoard[i][j] = '0';
				}
			}
 		}
		return answer;
	}
}