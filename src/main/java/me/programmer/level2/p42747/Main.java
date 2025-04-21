package me.programmer.level2.p42747;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] citations) {
		Arrays.sort(citations);
		int n = citations.length;
		int answer = 0;

		for (int i = 0; i < n; i++) {
			int h = n - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		return answer;
	}
}