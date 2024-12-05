package me.programmer.level0.p181939;

public class Main {
}
class Solution {
	public int solution(int a, int b) {
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);

		String ab = a1 + b1;
		String ba = b1 + a1;
		return Math.max(Integer.parseInt(ab), Integer.parseInt(ba));
	}
}
