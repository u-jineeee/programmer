package me.programmer.level2.p42584;

import java.util.Stack;

public class Main {
}
class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < prices.length; i++) {
			if(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				int idx = stack.pop();
				answer[idx] = i - idx;
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			int idx = stack.pop();
			answer[idx] = prices.length - idx - 1;
		}
		return answer;
	}
}