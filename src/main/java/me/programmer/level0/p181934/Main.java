package me.programmer.level0.p181934;

public class Main {
}
class Solution {
	public int solution(String ineq, String eq, int n, int m) {
		int answer;
		if(ineq.equals("<")){
			if(eq.equals("="))
				answer = n <= m ? 1 : 0;
			else
				answer = n < m ? 1 : 0;
		} else {
			if(eq.equals("="))
				answer = n >= m ? 1 : 0;
			else
				answer = n > m ? 1 : 0;
		}
		return answer;
	}
}