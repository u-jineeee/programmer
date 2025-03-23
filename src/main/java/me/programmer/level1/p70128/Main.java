package me.programmer.level1.p70128;

public class Main {
}
class Solution {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
		return answer;
	}
}