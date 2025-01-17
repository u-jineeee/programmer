package me.programmer.level0.p181866;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
}
class Solution {
	public String[] solution(String myString) {
		StringBuilder str = new StringBuilder();
		ArrayList<String> arrayList = new ArrayList<>();

		for(int i = 0; i < myString.length(); i++) {
			char c = myString.charAt(i);
			if(c == 'x') {
				if(str.length() == 0)
					continue;
				arrayList.add(str.toString());
				str = new StringBuilder();
			} else {
				str.append(c);
			}
		}
		if(str.length() != 0)
			arrayList.add(str.toString());

		Collections.sort(arrayList);
		String[] answer = new String[arrayList.size()];
		answer = arrayList.toArray(answer);
		return answer;
	}
}