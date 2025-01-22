package me.programmer.level0.p120888;

public class Main {
}
class Solution {
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < my_string.length(); i++) {
			boolean flag = false;
			for(int j = 0; j < i; j++) {
				if(my_string.charAt(i) == my_string.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				answer.append(my_string.charAt(i));
		}
		return answer.toString();
	}
}