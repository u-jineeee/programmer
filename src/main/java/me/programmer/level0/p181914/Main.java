package me.programmer.level0.p181914;

public class Main {
}
class Solution {
	public int solution(String number) {
		int sum = 0;
		for(int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt(String.valueOf(number.charAt(i)));
		}
		return sum % 9;
	}
}