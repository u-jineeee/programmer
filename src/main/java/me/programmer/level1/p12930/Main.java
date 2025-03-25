package me.programmer.level1.p12930;

public class Main {
}
class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		int flag = 0;
		for(char ch : s.toCharArray()) {
			if(ch == ' ') {
				flag = 0;
				answer.append(" ");
				continue;
			}
			if(flag % 2 == 0) {
				answer.append(String.valueOf(ch).toUpperCase());
			} else
				answer.append(String.valueOf(ch).toLowerCase());
			flag++;
		}
		return answer.toString();
	}
}