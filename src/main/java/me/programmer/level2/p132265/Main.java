package me.programmer.level2.p132265;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
}
class Solution {
	public int solution(int[] topping) {
		int answer = 0;
		Map<Integer, Integer> rightMap = new HashMap<>();
		Set<Integer> rightSet = new HashSet<>();
		Set<Integer> leftSet = new HashSet<>();

		for(int t : topping) {
			rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
			rightSet.add(t);
		}
		for(int i = 0; i < topping.length-1; i++) {
			Integer t = topping[i];
			leftSet.add(t);
			rightMap.put(t, rightMap.get(t) - 1);
			if(rightMap.get(t).equals(0))
				rightSet.remove(t);
			if(leftSet.size() == rightSet.size())
				answer++;
		}
		return answer;
	}
}