package me.programmer.level0.p120906;

public class Main {
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		while(n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}
}