package me.programmer.level2.p42842;

public class Main {
}
class Solution {
	public int[] solution(int brown, int yellow) {
		int x, y;
		for(int i = 1; i < brown/2; i++) {
			x = i;
			y = (brown + 4 - (x*2))/2;
			if(x*2 + y*2 - 4 == brown && (x-2) * (y-2) == yellow)
				return new int[]{y, x};
		}
		return new int[] {-1};
	}
}