package me.programmer.level0.p120895;

public class Main {
}
class Solution {
	public String solution(String my_string, int num1, int num2) {
		StringBuilder answer = new StringBuilder();
		char x = my_string.charAt(num1);
		char y = my_string.charAt(num2);
		for(int i = 0; i < my_string.length(); i++) {
			if(i == num1)
				answer.append(y);
			else if(i == num2)
				answer.append(x);
			else
				answer.append(my_string.charAt(i));
		}
		return answer.toString();
	}
}