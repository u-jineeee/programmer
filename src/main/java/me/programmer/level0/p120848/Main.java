package me.programmer.level0.p120848;

public class Main {
}
class Solution {
	public int solution(int n) {
		int i = 1;
		int factorial = 1;
		while(factorial < n) {
			factorial *= i;
			i++;
		}
		return i;
	}
}