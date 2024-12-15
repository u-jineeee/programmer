package me.programmer.level0.p181841;

public class Main {
}
class Solution {
	public String solution(String[] str_list, String ex) {
		StringBuilder answer = new StringBuilder();

		for(String s:str_list) {
			if(!s.contains(ex))
				answer.append(s);
		}
		return answer.toString();
	}
}