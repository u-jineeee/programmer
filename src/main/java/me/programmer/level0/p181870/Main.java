package me.programmer.level0.p181870;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public String[] solution(String[] strArr) {
		ArrayList<String> answer = new ArrayList<>();

		for(String str : strArr) {
			boolean flag = true;
			for(int i = 0; i < str.length()-1; i++) {
				if(str.charAt(i) == 'a' && str.charAt(i+1) == 'd') {
					flag = false;
					break;
				}
			}
			if(flag)
				answer.add(str);
		}
		return answer.toArray(new String[0]);
	}
}