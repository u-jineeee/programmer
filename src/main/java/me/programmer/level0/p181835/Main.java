package me.programmer.level0.p181835;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];

		if(k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] * k;
			}
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] + k;
			}
		}
		return answer;
	}
}