package me.programmer.level2.p12909;

import java.util.Stack;

public class Main {
}
class Solution {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		for(char ch : s.toCharArray()) {
			if(ch == '(')
				stack.push('(');
			else {
				if(!stack.empty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
			}
		}
		return stack.empty();
	}
}