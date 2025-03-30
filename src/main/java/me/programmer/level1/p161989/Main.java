package me.programmer.level1.p161989;

public class Main {
}
class Solution {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int[] paint = new int[n];
		for(int i : section) {
			paint[i-1] = 1;
		}
		for(int i = 0; i < paint.length; i++) {
			if(paint[i] == 1) {
				for(int j = i; j < i+m; j++) {
					if(j >= paint.length)
						break;
					paint[j]--;
				}
				i += m-1;
				answer++;
			}
		}
		return answer;
	}
}