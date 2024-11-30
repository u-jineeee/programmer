package me.programmer.level0.p181848;

public class Main {
}
class Solution {
	public int solution(String n_str) {
		int answer = n_str.charAt(0) - 48;
		for(int i = 1; i < n_str.length(); i++) {
			int x = n_str.charAt(i) - 48;
			answer = answer * 10 + x;
		}
		return answer;
	}
}
