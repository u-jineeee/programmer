package me.programmer.level2.p12973;

import java.util.Stack;

public class Main {
}
class Solution
{
	public int solution(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(char ch : s.toCharArray()) {
			if(stack.empty())
				stack.push(ch);
			else if(stack.peek() == ch)
				stack.pop();
			else
				stack.push(ch);
		}
		return stack.empty() ? 1 : 0;
	}
}