package me.programmer.level1.p12982;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for(int x : d) {
			if(x > budget) {
				break;
			}
			budget -= x;
			answer++;
		}
		return answer;
	}
}