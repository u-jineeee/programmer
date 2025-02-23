package me.programmer.level0.p181918;

import java.util.Stack;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < arr.length;){
			if(stack.isEmpty()) {
				stack.add(arr[i]);
				i++;
			}
			else if(stack.peek() < arr[i]) {
				stack.add(arr[i]);
				i++;
			}
			else
				stack.pop();
		}
		int[] stk = new int[stack.size()];
		for(int i = 0; i < stack.size(); i++)
			stk[i] = stack.get(i);
		return stk;
	}
}