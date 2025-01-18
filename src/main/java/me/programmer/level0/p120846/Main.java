package me.programmer.level0.p120846;

public class Main {
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		for(int i = 3; i <= n; i++) {
			if(i % 2 == 0)
				answer++;
			else {
				for(int j = 3; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						answer++;
						break;
					}
				}
			}
		}
		return answer;
	}
}