package me.programmer.level0.p181943;

public class Main {
}
class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		StringBuilder answer = new StringBuilder();

		for(int i = 0; i < s; i++) {
			answer.append(my_string.charAt(i));
		}
		answer.append(overwrite_string);
		for(int i = overwrite_string.length()+s; i < my_string.length(); i++) {
			answer.append(my_string.charAt(i));
		}
		return answer.toString();
	}
}