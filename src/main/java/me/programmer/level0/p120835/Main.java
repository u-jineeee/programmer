package me.programmer.level0.p120835;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int[] solution(int[] emergency) {
		int[] sort = new int[emergency.length];
		int[] answer = new int[emergency.length];

		System.arraycopy(emergency, 0, sort, 0, emergency.length);
		Arrays.sort(sort);

		for(int i = 0; i < sort.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if (emergency[j] == sort[i])
					answer[i] = emergency.length - j;
			}
		}
		return answer;
	}
}