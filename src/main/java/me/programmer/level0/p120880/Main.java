package me.programmer.level0.p120880;

public class Main {
}
class Solution {
	public int[] solution(int[] numlist, int n) {
		for(int i = 0; i < numlist.length; i++) {
			for(int j = 0; j < numlist.length-1; j++) {
				int x = numlist[j] - n;
				int y = numlist[j+1] - n;

				if(Math.abs(x) > Math.abs(y) || (Math.abs(x) == Math.abs(y) && x < y)) {
					int temp = numlist[j];
					numlist[j] = numlist[j+1];
					numlist[j+1] = temp;
				}
			}
		}
		return numlist;
	}
}