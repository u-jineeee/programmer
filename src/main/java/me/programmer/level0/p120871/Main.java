package me.programmer.level0.p120871;

public class Main {
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		for(int i = 0, j = 1; i < n; i++, j++){
			String x = Integer.toString(j);
			if(x.contains("3") || j % 3 == 0)
				i--;
			answer++;
		}
		return answer;
	}
}