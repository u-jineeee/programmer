package me.programmer.level1.p131128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
}
class Solution {
	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();
		Map<String, Integer> xMap = new TreeMap<>();
		Map<String, Integer> yMap = new TreeMap<>();
		List<String> list = new ArrayList<>();
		int idx = 0;
		int zero = 0;
		for(char ch : X.toCharArray()) {
			String s = String.valueOf(ch);
			xMap.put(s, xMap.getOrDefault(s, 0) + 1);
		}
		for(char ch : Y.toCharArray()) {
			String s = String.valueOf(ch);
			yMap.put(s, yMap.getOrDefault(s, 0) + 1);
		}
		for(String xKey : xMap.keySet()) {
			for(int i = idx; i < yMap.size(); i++) {
				if(yMap.containsKey(xKey)) {
					idx = i + 1;
					list.add(xKey.repeat(Math.min(xMap.get(xKey), yMap.get(xKey))));
					if(xKey.equals("0"))
						zero = Math.min(xMap.get(xKey), yMap.get(xKey));
					break;
				}
			}
		}
		if(list.isEmpty())
			return "-1";
		list.sort(Collections.reverseOrder());
		for (String s : list) {
			answer.append(s);
		}
		if(zero == answer.length())
			return "0";
		return answer.toString();
	}
}