package me.programmer.level0.p120816;

public class Main {
}
class Solution {
	public int solution(int slice, int n) {
		if (n % slice == 0)
			return n / slice;

		return n / slice + 1;
	}
}
