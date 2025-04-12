package me.programmer.level2.p12924;

public class Main {
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		int num = 1;
		while(num <= n) {
			int sum = 0;
			for(int i = num; i <= n; i++) {
				sum += i;
				if(sum == n) {
					answer++;
					break;
				} else if(sum > n)
					break;
			}
			num++;
		}
		return answer;
	}
}