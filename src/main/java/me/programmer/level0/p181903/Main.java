package me.programmer.level0.p181903;

public class Main {
}
class Solution {
	public String solution(int q, int r, String code) {
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < code.length(); i++){
			if(i % q == r)
				answer.append(code.charAt(i));
		}
		return answer.toString();
	}
}