package me.programmer.level0.p181861;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int a : arr) {
			for(int i = 0; i < a; i++) {
				answer.add(a);
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}