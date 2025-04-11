package me.programmer.level2.p12951;

public class Main {
}
class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(i == 0 && ch >= 'a' && ch <= 'z')
				answer.append((char)(ch - 32));
			else if(i != 0 && s.charAt(i-1) == ' ' && ch != ' ' && ch >= 'a' && ch <= 'z')
				answer.append((char)(ch - 32));
			else
				answer.append(ch);
		}
		return answer.toString();
	}
}