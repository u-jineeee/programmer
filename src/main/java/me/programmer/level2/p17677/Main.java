package me.programmer.level2.p17677;

import java.util.HashMap;
import java.util.Map;

public class Main {
}
class Solution {
	public int solution(String str1, String str2) {
		Map<String, Integer> map1 = getStringMap(str1);
		Map<String, Integer> map2 = getStringMap(str2);
		int intersection = 0;
		int union = 0;

		for(Map.Entry<String, Integer> map : map1.entrySet()) {
			intersection += Math.min(map.getValue(), map2.getOrDefault(map.getKey(), 0));
			union += map.getValue();
		}
		for(Map.Entry<String, Integer> map : map2.entrySet()) {
			union += map.getValue();
		}

		union = union - intersection;
		double x = (double) intersection / union * 65536;
		return map1.size() == 0 && map2.size() == 0 ? 65536 : (int)x;
	}
	public Map<String, Integer> getStringMap(String str) {
		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < str.length()-1; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(str.charAt(i));
			stringBuilder.append(str.charAt(i+1));
			String s = stringBuilder.toString().toUpperCase();
			if(s.matches("^[A-Z]+$"))
				map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return map;
	}
}