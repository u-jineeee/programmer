package me.programmer.level0.p120887;

public class Main {
}
class Solution {
	public int solution(int i, int j, int k) {
		int answer = 0;
		for(int x = i; x <= j; x++) {
			String[] str = String.valueOf(x).split("");
			for (String s : str) {
				if (s.contains(String.valueOf(k)))
					answer++;
			}
		}
		return answer;
	}
}