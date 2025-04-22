package me.programmer.level2.p42578;

import java.util.HashMap;
import java.util.Map;

public class Main {
}
class Solution {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> clothesMap = new HashMap<>();
		for(String[] str : clothes) {
			clothesMap.put(str[1], clothesMap.getOrDefault(str[1], 0) + 1);
		}

		for(int n : clothesMap.values())
			answer *= (n+1);
		return answer - 1;
	}
}