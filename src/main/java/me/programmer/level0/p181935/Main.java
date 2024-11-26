package me.programmer.level0.p181935;

public class Main {
}
class Solution {
	public int solution(int n) {
		if (n % 2 != 0) {
			return (1 + n) / 2 * (n/2 + 1);
		}

		int answer = 0;
		for (int i = 2; i <= n; i+=2) {
			answer += i * i;
		}
		return answer;
	}
}