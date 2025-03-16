package me.programmer.level0.p120923;

public class Main {
}
class Solution {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		int mid = total / num;
		int sum = -1;
		int n = 0;
		while(sum != total) {
			n = mid - (num - 1)/2;
			sum = 0;
			for(int i = n; i < n + num; i++) {
				sum += i;
			}
			mid++;
		}
		for(int i = 0; i < num; i++) {
			answer[i] = n + i;
		}
		return answer;
	}
}