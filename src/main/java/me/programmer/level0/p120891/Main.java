package me.programmer.level0.p120891;

public class Main {
}
class Solution {
	public int solution(int order) {
		int answer = 0;
		while(order > 0) {
			int r = order % 10;
			if(r == 3 || r == 6 || r == 9)
				answer++;
			order = order / 10;
		}
		return answer;
	}
}