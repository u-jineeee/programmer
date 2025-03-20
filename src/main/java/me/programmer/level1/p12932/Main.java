package me.programmer.level1.p12932;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(long n) {
		List<Long> answer = new ArrayList<>();
		while(n != 0) {
			answer.add(n % 10);
			n /= 10;
		}
		return answer.stream().mapToInt(Long::intValue).toArray();
	}
}