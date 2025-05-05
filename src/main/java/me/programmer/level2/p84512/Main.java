package me.programmer.level2.p84512;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	List<String> list = new ArrayList<>();
	String[] vowels = {"A", "E", "I", "O", "U"};
	public int solution(String word) {
		getWords("");
		return list.indexOf(word) + 1;
	}
	public void getWords(String currentWord) {
		if(!currentWord.isEmpty())
			list.add(currentWord);
		if(currentWord.length() == 5)
			return;
		for(String vowel : vowels)
			getWords(currentWord + vowel);
	}
}