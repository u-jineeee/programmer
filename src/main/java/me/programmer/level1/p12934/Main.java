package me.programmer.level1.p12934;

public class Main {
}
class Solution {
	public long solution(long n) {
		int sqrt = (int)Math.sqrt(n);
		if((long)sqrt * sqrt == n)
			return (long)(sqrt + 1) * (sqrt + 1);
		return -1;
	}
}