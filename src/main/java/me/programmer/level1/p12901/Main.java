package me.programmer.level1.p12901;

public class Main {
}
class Solution {
	public String solution(int a, int b) {
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;
		for(int i = 0; i < a-1; i++) {
			days += month[i];
		}
		days += b;
		return week[(days-1)%7];
	}
}