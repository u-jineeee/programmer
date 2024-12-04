package me.programmer.level0.p120889;

public class Main {
}
class Solution {
	public int solution(int[] sides) {
		for(int i = 0; i < 2; i++) {
			for(int j = i+1; j < 3; j++) {
				if(sides[i] > sides[j]) {
					int temp = sides[i];
					sides[i] = sides[j];
					sides[j] = temp;
				}
			}
		}
		return sides[2] < sides[0] + sides[1] ? 1 : 2;
	}
}