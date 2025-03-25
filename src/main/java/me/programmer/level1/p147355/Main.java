package me.programmer.level1.p147355;

public class Main {
}
class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		long pInt = Long.parseLong(p);
		for(int i = 0; i <= t.length() - p.length(); i++) {
			long tInt = Long.parseLong(t.substring(i, i+p.length()));
			if(tInt <= pInt)
				answer++;
		}
		return answer;
	}
}