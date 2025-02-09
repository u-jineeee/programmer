package me.programmer.level0.p181917;

public class Main {
}
class Solution {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean y1 = x1 || x2;
		boolean y2 = x3 || x4;
		return y1 && y2;
	}
}