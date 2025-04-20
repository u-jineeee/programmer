package me.programmer.level2.p87390;

public class Main {
}
class Solution {
	public int[] solution(int n, long left, long right) {
		int size = (int)(right - left + 1);
		int[] answer = new int[size];
		for(int i = 0; i < size; i++) {
			long x = i + left;
			long row = x / n;
			long col = x % n;
			answer[i] = (int)Math.max(row, col) + 1;
		}
		return answer;
	}
}