package me.programmer.level0.p181867;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(String myString) {
		ArrayList<Integer> answer = new ArrayList<>();
		int cnt = 0;

		for(int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i) != 'x') {
				cnt++;
			}
			else {
				answer.add(cnt);
				cnt = 0;
			}
		}
		answer.add(cnt);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}