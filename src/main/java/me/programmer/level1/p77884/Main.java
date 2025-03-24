package me.programmer.level1.p77884;

public class Main {
}
class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		for(int i = left; i <= right; i++) {
			if(getDivisorCount(i) % 2 == 0)
				answer += i;
			else
				answer -= i;
		}
		return answer;
	}
	public int getDivisorCount(int x) {
		int cnt = 0;
		for(int i = 1; i < Math.sqrt(x); i++) {
			if(x % i == 0)
				cnt++;
		}
		cnt = cnt*2;
		if((int)Math.sqrt(x) * Math.sqrt(x) == x)
			cnt++;
		return cnt;
	}
}