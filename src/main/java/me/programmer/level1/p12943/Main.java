package me.programmer.level1.p12943;

public class Main {
}
class Solution {
	public int solution(int num) {
		int answer = -1;
		long x = num;
		int cnt = 0;
		while(cnt < 500) {
			if(x == 1)
				return cnt;

			if(x % 2 == 0)
				x /= 2;
			else
				x = x*3 + 1;
			cnt++;
		}
		return answer;
	}
}