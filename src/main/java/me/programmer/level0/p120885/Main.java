package me.programmer.level0.p120885;

public class Main {
}
class Solution {
	public String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}
}