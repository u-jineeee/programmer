package me.programmer.level0.p120585;

public class Main {
}
class Solution {
	public int solution(int[] array, int height) {
		int answer = 0;
		for(int a : array) {
			if (a > height)
				answer++;
		}
		return answer;
	}
}
