package me.programmer.level1.p134240;

public class Main {
}
class Solution {
	public String solution(int[] food) {
		StringBuilder answer = new StringBuilder();
		for(int i = 1; i < food.length; i++) {
			answer.append(String.valueOf(i).repeat(food[i]/2));
		}
		answer.append(0);
		for(int i = answer.length()-2; i >= 0; i--) {
			answer.append(answer.charAt(i));
		}
		return answer.toString();
	}
}