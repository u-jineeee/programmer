package me.programmer.level1.p147355;

public class Main {
}
class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		int pInt = Integer.parseInt(p);
		for(int i = 0; i <= t.length() - p.length(); i++) {
			int tInt = Integer.parseInt(t.substring(i, i+p.length()));
			if(tInt <= pInt)
				answer++;
		}
		return answer;
	}
}