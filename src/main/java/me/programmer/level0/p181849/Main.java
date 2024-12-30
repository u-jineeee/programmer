package me.programmer.level0.p181849;

public class Main {
}
class Solution {
	public int solution(String num_str) {
		int answer = 0;

		for(int i = 0; i < num_str.length(); i++) {
			answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
		}
		return answer;
	}
}