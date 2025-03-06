package me.programmer.level0.p120840;

public class Main {
}
class Solution {
	public double solution(int balls, int share) {
		double answer = 1;

		for(int i = 0; i < share; i++) {
			answer *= (double)(balls - i) / (i + 1);
		}
		return answer;
	}
}