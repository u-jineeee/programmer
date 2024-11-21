package me.programmer.level0.p120830;

public class Main {
}
class Solution {
	public int solution(int n, int k) {
		int f = n/10;

		return n*12000 + (k-f)*2000;
	}
}