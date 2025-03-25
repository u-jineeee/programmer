package me.programmer.level1.p12940;

public class Main {
}
class Solution {
	public int[] solution(int n, int m) {
		int gcd = getGCD(n, m);
		return new int[]{gcd, n*m/gcd};
	}
	public int getGCD(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}