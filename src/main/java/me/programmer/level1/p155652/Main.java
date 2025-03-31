package me.programmer.level1.p155652;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
}
class Solution {
	public String solution(String s, String skip, int index) {
		StringBuilder answer = new StringBuilder();
		List<String> alphabet = new ArrayList<>();
		String[] skipArr = skip.split("");
		Arrays.sort(skipArr);
		int idx = 0;
		for(int i = 0; i < 26; i++) {
			char x = (char)('a' + i);
			if(idx < skipArr.length && skipArr[idx].equals(String.valueOf(x))) {
				idx++;
				continue;
			}
			alphabet.add(String.valueOf((char)(x)));
		}

		for(char ch : s.toCharArray()) {
			answer.append(alphabet.get((alphabet.indexOf(String.valueOf(ch)) + index)%alphabet.size()));
		}
		return answer.toString();
	}
}