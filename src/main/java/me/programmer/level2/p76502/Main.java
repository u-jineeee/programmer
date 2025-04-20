package me.programmer.level2.p76502;

import java.util.Stack;

public class Main {
}
class Solution {
	public int solution(String s) {
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			StringBuilder str = new StringBuilder(s.substring(i));
			str.append(s.substring(0, i));
			Stack<Character> stack = new Stack<>();
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(stack.empty())
					stack.push(ch);
				else if(stack.peek() == '(' && ch == ')')
					stack.pop();
				else if(stack.peek() == '{' && ch == '}')
					stack.pop();
				else if(stack.peek() == '[' && ch == ']')
					stack.pop();
				else
					stack.push(ch);
			}
			if(stack.empty())
				answer++;
		}
		return answer;
	}
}