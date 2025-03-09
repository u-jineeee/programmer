package me.programmer.level0.p120860;

public class Main {
}
class Solution {
	public int solution(int[][] dots) {
		int a = ((dots[0][0] - dots[1][0]) + (dots[0][0] - dots[2][0]) + (dots[0][0] - dots[3][0]))/2;
		int b = ((dots[0][1] - dots[1][1]) + (dots[0][1] - dots[2][1]) + (dots[0][1] - dots[3][1]))/2;
		return Math.abs(a * b);
	}
}