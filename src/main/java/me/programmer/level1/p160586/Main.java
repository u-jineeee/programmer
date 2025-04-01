package me.programmer.level1.p160586;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for(String key : keymap) {
			for(int i = 0; i < key.length(); i++) {
				String s = String.valueOf(key.charAt(i));
				if(!map.containsKey(s))
					map.put(s, i+1);
				else if(map.get(s) > i+1)
					map.put(s, i+1);
			}
		}
		for(String target : targets) {
			int sum = 0;
			for(int i = 0; i < target.length(); i++) {
				String s = String.valueOf(target.charAt(i));
				if(!map.containsKey(s)) {
					sum = -1;
					break;
				}
				else
					sum += map.get(s);
			}
			answer.add(sum);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}