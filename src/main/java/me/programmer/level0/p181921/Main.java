package me.programmer.level0.p181921;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int l, int r) {
		List<Integer> answer = new ArrayList<>();

		for(int i = l; i <= r; i++) {
			if(isValidNumber(i))
				answer.add(i);
		}

		if(answer.isEmpty())
			return new int[]{-1};
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	public boolean isValidNumber(int x) {
		String str = String.valueOf(x);
		for (char c : str.toCharArray()) {
			if (c != '0' && c != '5')
				return false;
		}
		return true;
	}
}