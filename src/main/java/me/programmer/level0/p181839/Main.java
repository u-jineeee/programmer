package me.programmer.level0.p181839;

public class Main {
}
class Solution {
	public int solution(int a, int b) {
		if(a % 2 != 0 && b % 2 != 0) {
			return a*a + b*b;
		}
		else if(a  % 2 != 0 || b % 2 != 0) {
			return 2 * (a + b);
		}
		return Math.abs(a - b);
	}
}