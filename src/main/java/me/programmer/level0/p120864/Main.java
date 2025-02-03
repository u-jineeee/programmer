package me.programmer.level0.p120864;

public class Main {
}
class Solution {
	public int solution(String my_string) {
		int answer = 0;
		int num = 0;
		for(int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			if(ch >= '0' && ch <= '9')
				num = num*10 + ch - '0';
			else {
				answer += num;
				num = 0;
			}

		}
		answer += num;
		return answer;
	}
}