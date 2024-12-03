package me.programmer.level0.p120833;

public class Main {
}
class Solution {
	public int[] solution(int[] numbers, int num1, int num2) {
		int size = num2 - num1 + 1;
		int[] answer = new int[size];

		for(int i = num1, j = 0; i <= num2; i++, j++) {
			answer[j] = numbers[i];
		}
		return answer;
	}
}
