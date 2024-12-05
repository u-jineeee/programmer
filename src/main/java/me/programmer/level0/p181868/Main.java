package me.programmer.level0.p181868;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public String[] solution(String my_string) {
		ArrayList<String> arrayList = new ArrayList<>();
		StringBuilder stringBuilder = new StringBuilder();

		for(int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if(c != ' ') {
				stringBuilder.append(c);
			}
			else {
				if(!stringBuilder.isEmpty()) {
					arrayList.add(stringBuilder.toString());
					stringBuilder = new StringBuilder();
				}
			}
		}

		if(!stringBuilder.isEmpty())
			arrayList.add(stringBuilder.toString());

		String[] answer = arrayList.toArray(new String[0]);
		return answer;
	}
}