package me.programmer.level0.p120808;

public class Main {
}
class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = numer1*denom2 + numer2*denom1;
		int denom = denom1 * denom2;
		int gcd = findGCD(numer, denom);
		return new int[]{numer/gcd, denom/gcd};
	}
	public int findGCD(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}