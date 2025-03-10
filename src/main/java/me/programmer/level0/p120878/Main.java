package me.programmer.level0.p120878;

public class Main {
}
class Solution {
	public int solution(int a, int b) {
		int gcd = findGCD(a, b);
		b = b / gcd;

		while(b % 2 == 0){
			b = b / 2;
		}
		while(b % 5 == 0){
			b = b / 5;
		}
		if(b == 1)
			return 1;
		return 2;
	}
	public int findGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}