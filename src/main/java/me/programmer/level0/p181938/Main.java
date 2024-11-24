package me.programmer.level0.p181938;

public class Main {
}
class Solution {
	public int solution(int a, int b) {
		int x = Integer.parseInt(a + String.valueOf(b));
		int y = 2 * a * b;
		return Math.max(x, y);
	}
}