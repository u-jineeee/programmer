package me.programmer.level0.p120850;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
}
class Solution {
	public int[] solution(String my_string) {
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9')
				answer.add(my_string.charAt(i)-'0');
		}

		Collections.sort(answer);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}