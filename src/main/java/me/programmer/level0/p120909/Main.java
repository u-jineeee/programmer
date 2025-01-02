package me.programmer.level0.p120909;

public class Main {
}
class Solution {
	public int solution(int n) {
		double sqrt = Math.sqrt(n);
		double point = sqrt - (int)sqrt;
		return point == 0 ? 1 : 2;
	}
}