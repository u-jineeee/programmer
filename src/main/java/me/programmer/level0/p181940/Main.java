package me.programmer.level0.p181940;

public class Main {
}
class Solution {
	public String solution(String my_string, int k) {
		StringBuilder answer = new StringBuilder();
		answer.append(String.valueOf(my_string).repeat(k));
		return answer.toString();
	}
}