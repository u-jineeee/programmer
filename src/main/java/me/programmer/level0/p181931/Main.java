package me.programmer.level0.p181931;

public class Main {
}
class Solution {
	public int solution(int a, int d, boolean[] included) {
		int[] seq = new int[included.length];
		int answer = 0;

		for(int i = 0; i < seq.length; i++) {
			seq[i] = a;
			a = a + d;
		}
		for(int i = 0; i < seq.length; i++) {
			if(included[i])
				answer += seq[i];
		}
		return answer;
	}
}