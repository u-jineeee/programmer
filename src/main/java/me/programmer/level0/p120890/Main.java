package me.programmer.level0.p120890;

public class Main {
}
class Solution {
	public int solution(int[] array, int n) {
		int answer = array[0];
		int diff = Math.abs(n - array[0]);

		for(int num : array) {
			int x = Math.abs(n - num);
			if(x < diff) {
				diff = x;
				answer = num;
			} else if(x == diff && answer > num) {
				answer = num;
			}
		}
		return answer;
	}
}