package me.programmer.level1.p12916;

public class Main {
}
class Solution {
	boolean solution(String s) {
		int cntY = 0;
		int cntP = 0;

		for(char ch : s.toCharArray()) {
			if(ch == 'y' || ch == 'Y')
				cntY++;
			else if(ch == 'p' || ch == 'P')
				cntP++;
		}

		return cntY == cntP;
	}
}