package me.programmer.level0.p120905;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int num : numlist) {
			if(num % n == 0) {
				answer.add(num);
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}