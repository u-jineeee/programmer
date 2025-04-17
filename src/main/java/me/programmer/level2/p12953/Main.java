package me.programmer.level2.p12953;

public class Main {
}
class Solution {
	public int solution(int[] arr) {
		int answer = arr[0];
		for(int n : arr) {
			answer = lcm(answer, n);
		}
		return answer;
	}
	public int gcd(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	public int lcm(int x, int y) {
		return x * y / gcd(x, y);
	}
}