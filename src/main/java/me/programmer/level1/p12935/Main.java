package me.programmer.level1.p12935;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		if(arr.length == 1)
			return new int[]{-1};
		int minIdx = 0;
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				minIdx = i;
				min = arr[i];
			}
		}
		int[] answer = new int[arr.length-1];
		int idx = 0;
		for(int i = 0; i < answer.length; i++) {
			if(i == minIdx)
				idx++;
			answer[i] = arr[idx++];
		}
		return answer;
	}
}