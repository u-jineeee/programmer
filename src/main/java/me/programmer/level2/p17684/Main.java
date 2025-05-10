package me.programmer.level2.p17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int[] solution(String msg) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < 26; i++) {
			char c = (char)('A' + i);
			map.put(String.valueOf(c), i+1);
		}
		for(int i = 0; i < msg.length(); i++) {
			StringBuilder s1 = new StringBuilder();
			s1.append(msg.charAt(i));
			int n = map.get(s1.toString());
			if(i == msg.length()-1) {
				answer.add(n);
				break;
			}
			while(i < msg.length()-1) {
				s1.append(msg.charAt(i+1));
				if(map.get(s1.toString()) == null)
					break;
				i++;
				n = map.get(s1.toString());
			}
			answer.add(n);
			map.put(s1.toString(), map.size()+1);
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}