package me.programmer.level0.p120836;

public class Main {
}
class Solution {
	public int solution(int n) {
		if(n == 1)
			return 1;
		int answer = 1;
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0)
				answer++;
		}
		answer = answer * 2;
		if((int)Math.sqrt(n) * Math.sqrt(n) == n)
			answer++;
		return answer;
	}
}