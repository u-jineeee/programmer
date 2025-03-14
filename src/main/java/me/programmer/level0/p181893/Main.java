package me.programmer.level0.p181893;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int[] query) {
		List<Integer> answer = new ArrayList<>();
		for(int n : arr) {
			answer.add(n);
		}
		for(int i = 0; i < query.length; i++) {
			int idx = query[i];
			if(i % 2 == 0) {
				answer = answer.subList(0, idx+1);
			} else {
				answer = answer.subList(idx, answer.size());
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}