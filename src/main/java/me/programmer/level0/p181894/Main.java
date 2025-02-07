package me.programmer.level0.p181894;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		int idx1 = -1;
		int idx2 = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				if(idx1 == -1)
					idx1 = i;
				else
					idx2 = i;
			}
		}

		int[] answer;
		if(idx1 == -1) {
			answer = new int[1];
			answer[0] = -1;
		} else if (idx2 == -1) {
			answer = new int[1];
			answer[0] = 2;
		} else {
			answer = new int[idx2 - idx1 + 1];
			int cnt = 0;
			for(int i = idx1; i <= idx2; i++) {
				answer[cnt++] = arr[i];
			}
		}
		return answer;
	}
}