package me.programmer.level0.p120843;

public class Main {
}
class Solution {
	public int solution(int[] numbers, int k) {
		int x = (1 + (k - 1)*2) % numbers.length;
		return x == 0 ? numbers.length : x;
	}
}