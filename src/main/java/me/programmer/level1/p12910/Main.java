package me.programmer.level1.p12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> answer = new ArrayList<>();
		for(int x : arr) {
			if(x % divisor == 0)
				answer.add(x);
		}
		if(answer.isEmpty())
			return new int[]{-1};

		Collections.sort(answer);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}