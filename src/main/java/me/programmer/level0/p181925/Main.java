package me.programmer.level0.p181925;

public class Main {
}
class Solution {
	public String solution(int[] numLog) {
		StringBuilder answer = new StringBuilder();

		for(int i = 1; i < numLog.length; i++) {
			int num = numLog[i] - numLog[i-1];
			if(num == 1)
				answer.append('w');
			else if(num == -1)
				answer.append('s');
			else if(num == 10)
				answer.append('d');
			else
				answer.append('a');
		}
		return answer.toString();
	}
}