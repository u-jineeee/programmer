package me.programmer.level0.p181904;

public class Main {
}
class Solution {
	public String solution(String my_string, int m, int c) {
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < my_string.length()/m; i++) {
			answer.append(my_string.charAt(i*m+c-1));
		}
		return answer.toString();
	}
}