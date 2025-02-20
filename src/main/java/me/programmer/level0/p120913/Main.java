package me.programmer.level0.p120913;

import java.util.Arrays;

public class Main {
}
class Solution {
	public String[] solution(String my_str, int n) {
		String[] answer;
		if(my_str.length()%n == 0)
			answer = new String[my_str.length()/n];
		else
			answer = new String[my_str.length()/n + 1];
		Arrays.fill(answer, "");

		for(int i = 0; i < my_str.length(); i++) {
			int j = i / n;
			answer[j] += String.valueOf(my_str.charAt(i));
		}
		return answer;
	}
}