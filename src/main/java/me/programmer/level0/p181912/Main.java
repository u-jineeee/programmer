package me.programmer.level0.p181912;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] intNum = new int[intStrs.length];
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i = 0; i < intStrs.length; i++) {
			intNum[i] = Integer.parseInt(intStrs[i].substring(s, s+l));
		}
		for(int num : intNum) {
			if(num > k)
				answer.add(num);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}