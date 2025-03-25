package me.programmer.level1.p68935;

public class Main {
}
class Solution {
	public int solution(int n) {
		StringBuilder str = new StringBuilder();
		int answer = 0;
		while(n > 0) {
			int r = n % 3;
			n /= 3;
			str.append(r);
		}
		for(int i = 1; i <= str.length(); i++) {
			int x = Integer.parseInt(String.valueOf(str.toString().charAt(i - 1)));
			answer += x * Math.pow(3, str.length() - i);
		}
		return answer;
	}
}