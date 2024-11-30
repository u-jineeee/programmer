package me.programmer.level0.p120893;

public class Main {
}
class Solution {
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (c >= 'a' && c <= 'z')
				answer.append((char)(c-32));
			else
				answer.append((char)(c+32));
		}
		return answer.toString();
	}
}
