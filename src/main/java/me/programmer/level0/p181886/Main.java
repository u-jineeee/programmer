package me.programmer.level0.p181886;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public String[] solution(String[] names) {
		ArrayList<String> answer = new ArrayList<>();

		for(int i = 0; i < names.length; i += 5)
			answer.add(names[i]);

		return answer.toArray(new String[0]);
	}
}