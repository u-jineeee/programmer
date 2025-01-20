package me.programmer.level0.p120838;

import java.util.HashMap;

public class Main {
}
class Solution {
	public String solution(String letter) {
		HashMap<String, Character> morse = new HashMap<>();
		morse.put(".-", 'a');
		morse.put("-...", 'b');
		morse.put("-.-.", 'c');
		morse.put("-..", 'd');
		morse.put(".", 'e');
		morse.put("..-.", 'f');
		morse.put("--.", 'g');
		morse.put("....", 'h');
		morse.put("..", 'i');
		morse.put(".---", 'j');
		morse.put("-.-", 'k');
		morse.put(".-..", 'l');
		morse.put("--", 'm');
		morse.put("-.", 'n');
		morse.put("---", 'o');
		morse.put(".--.", 'p');
		morse.put("--.-", 'q');
		morse.put(".-.", 'r');
		morse.put("...", 's');
		morse.put("-", 't');
		morse.put("..-", 'u');
		morse.put("...-", 'v');
		morse.put(".--", 'w');
		morse.put("-..-", 'x');
		morse.put("-.--", 'y');
		morse.put("--..", 'z');

		String[] letterArray = letter.split(" ");
		StringBuilder answer = new StringBuilder();
		for (String s : letterArray) {
			answer.append(morse.get(s));
		}
		return answer.toString();
	}
}