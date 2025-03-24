package me.programmer.level1.p82612;

public class Main {
}
class Solution {
	public long solution(int price, int money, int count) {
		long sum = 0;
		for(int i = 1; i <= count; i++) {
			sum += (long)i * price;
		}
		long answer = money - sum;
		return answer < 0 ? Math.abs(answer) : 0;
	}
}