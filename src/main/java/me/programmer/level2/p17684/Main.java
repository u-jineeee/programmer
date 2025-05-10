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

		int nextIndex = 1;
		for(char c = 'A'; c <= 'Z'; c++) {
			map.put(String.valueOf(c), nextIndex++);
		}

		int i = 0;
		while(i < msg.length()) {
			String w = "";
			int wIndex = -1;
			int j = i;

			while(j < msg.length()) {
				String currentWord = msg.substring(i, j + 1);

				if(map.containsKey(currentWord)) {
					w = currentWord;
					wIndex = map.get(w);
					j++;
				} else {
					map.put(currentWord, nextIndex++);
					break;
				}
			}
			answer.add(wIndex);
			i += w.length();
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}