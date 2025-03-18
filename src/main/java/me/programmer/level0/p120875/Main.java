package me.programmer.level0.p120875;

public class Main {
}
class Solution {
	public int solution(int[][] dots) {
		//dots[0]&dots[1], dots[2]&dots[3]
		if(getSlope(dots[0][0], dots[0][1], dots[1][0], dots[1][1]) == getSlope(dots[2][0], dots[2][1], dots[3][0], dots[3][1]))
			return 1;
		//dots[0]&dots[2], dots[1]&dots[3]
		if(getSlope(dots[0][0], dots[0][1], dots[2][0], dots[2][1]) == getSlope(dots[1][0], dots[1][1], dots[3][0], dots[3][1]))
			return 1;
		//dots[0]&dots[3], dots[1]&dots[2]
		if(getSlope(dots[0][0], dots[0][1], dots[3][0], dots[3][1]) == getSlope(dots[1][0], dots[1][1], dots[2][0], dots[2][1]))
			return 1;
		return 0;
	}
	public double getSlope(int x1, int y1, int x2, int y2) {
		return (double) (y2 - y1) / (x2 - x1);
	}
}