package me.programmer.level1.p64061;

import java.util.Stack;

public class Main {
}
class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int move : moves) {
			int doll = 0;
			for(int[] b : board) {
				if(b[move-1] > 0) {
					doll = b[move-1];
					b[move-1] = 0;
					break;
				}
			}
			if(doll > 0) {
				if (stack.size() > 0 && stack.peek() == doll) {
					stack.pop();
					answer++;
				} else
					stack.push(doll);
			}
		}
		return answer*2;
	}
}