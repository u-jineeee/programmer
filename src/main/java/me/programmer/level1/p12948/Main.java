package me.programmer.level1.p12948;

public class Main {
}
class Solution {
	public String solution(String phone_number) {
		StringBuilder answer = new StringBuilder();
		answer.append("*".repeat(Math.max(0, phone_number.length() - 4)));
		answer.append(phone_number.substring(phone_number.length()-4));
		return answer.toString();
	}
}