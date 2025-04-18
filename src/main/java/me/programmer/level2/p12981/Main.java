package me.programmer.level2.p12981;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int n, String[] words) {
		List<String> wordsList = new ArrayList<>();
		char beforeChar = ' ';
		for(int i = 0; i < words.length; i++) {
			char afterChar = words[i].charAt(0);
			if(beforeChar == ' ') {
				beforeChar = words[i].charAt(words[i].length()-1);
				wordsList.add(words[i]);
				continue;
			}
			if(beforeChar != afterChar || wordsList.contains(words[i])) {
				return new int[]{i%n+1, i/n+1};
			}
			wordsList.add(words[i]);
			beforeChar = words[i].charAt(words[i].length()-1);
		}

		return new int[]{0, 0};
	}
}