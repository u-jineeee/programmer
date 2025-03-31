package me.programmer.level1.p77484;

public class Main {
}
class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int match = 0;
		int zero = 0;
		for(int lotto : lottos) {
			if (lotto == 0) {
				zero++;
				continue;
			}
			for(int n : win_nums) {
				if(n == lotto) {
					match++;
					break;
				}
			}
		}
		int max = (match + zero) > 1 ? 7-(match + zero) : 6;
		int min = match > 1 ? 7 - match : 6;
		return new int[]{max, min};
	}
}