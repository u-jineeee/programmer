package me.programmer.level0.p181836;

public class Main {
}
class Solution {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length*k];
		int cnt = 0;
		for (String s : picture) {
			StringBuilder str = new StringBuilder();

			for (int j = 0; j < s.length(); j++) {
				str.append(String.valueOf(s.charAt(j)).repeat(Math.max(0, k)));
			}
			for (int x = 0; x < k; x++) {
				answer[cnt++] = str.toString();
			}
		}
		return answer;
	}
}