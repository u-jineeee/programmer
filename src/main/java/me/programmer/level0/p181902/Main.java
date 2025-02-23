package me.programmer.level0.p181902;

public class Main {
}
class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for(int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if(c >= 'a' && c <= 'z')
				answer[c-'a'+26]++;
			else
				answer[c-'A']++;
		}
		return answer;
	}
}