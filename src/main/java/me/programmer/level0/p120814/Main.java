package me.programmer.level0.p120814;

public class Main {
}
class Solution {
	public int solution(int n) {
		if (n < 7)
			return 1;
		else if (n % 7 == 0)
			return n / 7;
		else
			return n / 7 + 1;
	}
}
