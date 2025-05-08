package me.programmer.level2.p92335;

public class Main {
}
class Solution {
	public int solution(int n, int k) {
		int answer = 0;
		String s = Integer.toString(n, k);
		String[] arr = s.split("0");
		for (String str : arr) {
			if(str.equals(""))
				continue;
			if (isPrime(Long.parseLong(str)))
				answer++;
		}
		return answer;
	}
	public boolean isPrime(long x) {
		if(x <= 1)
			return false;
		if(x == 2)
			return true;
		if(x % 2 == 0)
			return false;

		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)
				return false;
		}
		return true;
	}
}