package me.programmer.level1.p68644;

import java.util.*;

public class Main {
}
class Solution {
	public int[] solution(int[] numbers) {
		Set<Integer> hashSet = new HashSet<>();
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				hashSet.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = hashSet.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}
}