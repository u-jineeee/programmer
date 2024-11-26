package me.programmer.level0.p120822;

public class Main {
}
class Solution {
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();

		for (int i = my_string.length()-1; i >= 0; i--) {
			answer.append(my_string.charAt(i));
		}
		return answer.toString();
	}
}
