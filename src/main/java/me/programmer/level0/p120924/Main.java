package me.programmer.level0.p120924;

public class Main {
}
class Solution {
	public int solution(int[] common) {
		int answer = 0;
		int d1 = common[1] - common[0];
		int d2 = common[2] - common[1];

		if(d1 == d2) {
			answer = common[common.length-1] + d1;
		} else {
			answer = common[common.length-1] * (common[1] / common[0]);
		}
		return answer;
	}
}