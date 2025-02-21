package me.programmer.level0.p181859;

import java.util.Stack;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		for (int i : arr) {
			if (stk.empty())
				stk.push(i);
			else if (stk.peek() == i) {
				stk.pop();
			} else {
				stk.add(i);
			}
		}

		if(stk.isEmpty())
			return new int[]{-1};
		int[] answer = new int[stk.size()];
		for(int i = 0; i < stk.size(); i++){
			answer[i] = stk.get(i);
		}
		return answer;
	}
}