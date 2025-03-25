package me.programmer.level1.p86491;

public class Main {
}
class Solution {
	public int solution(int[][] sizes) {
		int x = 0;
		int y = 0;
		for(int[] size : sizes) {
			int a = Math.max(size[0], size[1]);
			int b = Math.min(size[0], size[1]);
			if(a > x)
				x = a;
			if(b > y)
				y = b;
		}
		return x * y;
	}
}