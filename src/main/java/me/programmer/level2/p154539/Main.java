package me.programmer.level2.p154539;

import java.util.Arrays;
import java.util.Stack;

public class Main {
}
class Solution {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> stack = new Stack<>();
		Arrays.fill(answer, -1);

		for(int i = numbers.length-1; i >= 0; i--) {
			int n = numbers[i];
			while(!stack.isEmpty() && stack.peek() <= n)
				stack.pop();

			if(!stack.isEmpty())
				answer[i] = stack.peek();

			stack.push(n);
		}
		return answer;
	}
}