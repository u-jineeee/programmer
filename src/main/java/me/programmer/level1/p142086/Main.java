package me.programmer.level1.p142086;

public class Main {
}
class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			for(int j = 0; j < i; j++) {
				char y = s.charAt(j);
				if(x == y) {
					answer[i] = i - j;
				}
			}
			if(answer[i] == 0)
				answer[i] = -1;
		}
		return answer;
	}
}