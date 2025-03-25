package me.programmer.level1.p12926;

public class Main {
}
class Solution {
	public String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		for(char ch : s.toCharArray()) {
			char x;
			if(ch >= 'a' && ch <= 'z') {
				x = (char)(((ch + n)%'a')%26 + 'a');
			}
			else if(ch >= 'A' && ch <= 'Z')
				x = (char)(((ch + n)%'A')%26 + 'A');
			else
				x = ' ';
			answer.append(x);
		}
		return answer.toString();
	}
}