package me.programmer.level1.p12903;

public class Main {
}
class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		if(s.length() % 2 == 1)
			answer.append(s.charAt(s.length()/2));
		else
			answer.append(s, s.length()/2-1, s.length()/2+1);
		return answer.toString();
	}
}