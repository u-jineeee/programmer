package me.programmer.level1.p159994;

public class Main {
}
class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int idx1 = 0;
		int idx2 = 0;
		for(String x : goal) {
			if(idx1 < cards1.length && x.equals(cards1[idx1]))
				idx1++;
			else if(idx2 < cards2.length && x.equals(cards2[idx2]))
				idx2++;
			else
				return "No";
		}
		return "Yes";
	}
}