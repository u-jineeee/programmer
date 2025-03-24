package me.programmer.level1.p12918;

public class Main {
}
class Solution {
	public boolean solution(String s) {
		if(!(s.length() == 4 || s.length() == 6))
			return false;
		return s.matches("\\d+");
	}
}