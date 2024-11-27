package me.programmer.level0.p120849;

public class Main {
}
class Solution {
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < my_string.length(); i++) {
			char x = my_string.charAt(i);
			if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
				answer.append(x);
			}
		}
		return answer.toString();
	}
}
