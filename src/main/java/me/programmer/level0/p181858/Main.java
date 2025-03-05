package me.programmer.level0.p181858;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		int cnt = 0;

		for(int i = 0; i < k; i++)
			answer[i] = -1;

		for(int x : arr) {
			if(cnt == k)
				break;
			for(int i = 0; i < k; i++) {
				if(answer[i] == -1){
					answer[i] = x;
					cnt++;
					break;
				} else if(answer[i] == x){
					break;
				}
			}
		}
		return answer;
	}
}