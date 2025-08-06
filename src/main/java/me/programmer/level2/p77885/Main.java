package me.programmer.level2.p77885;

public class Main {
}
class Solution {
	public long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			long num = numbers[i];

			if (num % 2 == 0) {
				answer[i] = num + 1;
			}
			else {
				long addValue = (~num & (num + 1)) >> 1;
				answer[i] = num + addValue;
			}
		}
		return answer;
	}
}