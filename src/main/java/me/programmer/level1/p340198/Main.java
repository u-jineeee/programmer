package me.programmer.level1.p340198;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] mats, String[][] park) {
		Arrays.sort(mats);
		for(int i = mats.length-1; i >= 0; i--) {
			for(int j = 0; j < park.length; j++) {
				int cnt = 0;
				for(int k = 0; k < park[j].length; k++) {
					if(park[j][k].equals("-1")) {
						cnt++;
					} else {
						cnt = 0;
					}
					if(cnt == mats[i]) {
						if(isEmptySpace(mats[i], k-mats[i]+1, j, park))
							return mats[i];
						else {
							cnt--;
						}
					}
				}
			}
		}
		return -1;
	}
	public boolean isEmptySpace(int cnt, int x, int y, String[][] park) {
		if(x+cnt > park[0].length || y+cnt > park.length)
			return false;
		for(int i = y+1; i < y+cnt; i++) {
			for(int j = x; j < x+cnt; j++) {
				if(!park[i][j].equals("-1"))
					return false;
			}
		}
		return true;
	}
}