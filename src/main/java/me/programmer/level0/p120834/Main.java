package me.programmer.level0.p120834;

public class Main {
}
class Solution {
	public String solution(int age) {
		String[] age962 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		StringBuilder answer = new StringBuilder();

		String ageS = String.valueOf(age);
		for(int i = 0; i < ageS.length(); i++) {
			answer.append(age962[Integer.parseInt(String.valueOf(ageS.charAt(i)))]);
		}
		return answer.toString();
	}
}