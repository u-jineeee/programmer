package me.programmer.level2.p12900;

public class Main {
}
class Solution {
	public int solution(int n) {
		long[] dp = new long[n+1];

		if(n >= 1)
			dp[1] = 1;
		if(n >= 2)
			dp[2] = 2;

		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
		}
		return (int)dp[n];
	}
}
