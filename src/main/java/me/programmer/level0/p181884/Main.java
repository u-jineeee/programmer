package me.programmer.level0.p181884;

public class Main {
}
class Solution {
	public int solution(int[] numbers, int n) {
		int answer = 0;
		while(answer < n) {
			for(int num:numbers) {
				if(answer > n)
					break;
				answer += num;
			}
		}
		if(n == 0)
			answer += numbers[0];
		return answer;
	}
}