package me.programmer.level1.p389478;

public class Main {
}
class Solution {
	public int solution(int n, int w, int num) {
		int answer = 0;
		int x, y;
		int z = ((((num - 1) / w) + 1) * w - num) * 2 + 1;
		if(((num-1)/w)%2 == 0) {
			x = z;
			y = w*2 - x;
		} else {
			y = z;
			x = w*2 - y;
		}
		while(num <= n) {
			if((num-1)/w%2 == 0)
				num += x;
			else
				num += y;
			answer++;
		}
		return answer;
	}
}