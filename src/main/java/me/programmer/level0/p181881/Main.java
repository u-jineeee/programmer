package me.programmer.level0.p181881;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] arr) {
		int answer = 0;
		int[] before = new int[arr.length];
		int[] after = new int[arr.length];

		System.arraycopy(arr, 0, before, 0, arr.length);

		while(true) {
			for(int i = 0; i < arr.length; i++) {
				if(before[i] >= 50 && before[i]%2 == 0)
					after[i] = before[i]/2;
				else if(before[i] < 50 && before[i]%2 == 1)
					after[i] = before[i]*2 + 1;
				else
					after[i] = before[i];
			}

			if (Arrays.equals(before, after)) {
				break;
			} else {
				System.arraycopy(after, 0, before, 0, arr.length);
			}
			answer++;
		}

		return answer;
	}
}