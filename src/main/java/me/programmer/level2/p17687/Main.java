package me.programmer.level2.p17687;

public class Main {
}
class Solution {
	public String solution(int n, int t, int m, int p) {
		StringBuilder answer = new StringBuilder();
		StringBuilder full = new StringBuilder();
		int num = 0;
		int length = t * m;

		while(full.length() < length) {
			String s = Integer.toString(num, n).toUpperCase();
			full.append(s);
			num++;
		}
		for(int i = 0; i < t; i++) {
			answer.append(full.charAt((p-1) + i * m));
		}
		return answer.toString();
	}
}