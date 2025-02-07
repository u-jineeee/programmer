package me.programmer.level0.p181862;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public String[] solution(String myStr) {
		ArrayList<String> arrayList = new ArrayList<>();
		StringBuilder stringBuilder = new StringBuilder();

		for(int i = 0; i < myStr.length(); i++) {
			char ch = myStr.charAt(i);
			if(ch == 'a' || ch == 'b' || ch == 'c') {
				if(!stringBuilder.isEmpty()) {
					arrayList.add(stringBuilder.toString());
					stringBuilder = new StringBuilder();
				}
			} else {
				stringBuilder.append(ch);
			}
		}
		if(!stringBuilder.isEmpty())
			arrayList.add(stringBuilder.toString());

		String[] answer = new String[arrayList.size()];
		answer = arrayList.isEmpty() ? new String[] {"EMPTY"} : arrayList.toArray(answer);
		return answer;
	}
}