package me.programmer.level0.p120812;

import java.util.HashMap;
import java.util.Map;

public class Main {
}
class Solution {
	public int solution(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		int answer = 0;
		int max = 0;
		boolean duplicate = false;

		for(int x : array) {
			if(map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x, 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				answer = entry.getKey();
				max = entry.getValue();
				duplicate = false;
			} else if(max == entry.getValue()) {
				duplicate = true;
			}
		}
		return duplicate ? -1 : answer;
	}
}