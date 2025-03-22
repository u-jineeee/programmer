package me.programmer.level1.p12947;

public class Main {
}
class Solution {
	public boolean solution(int x) {
		int sum = 0;
		String[] array = String.valueOf(x).split("");
		for(String s : array) {
			sum += Integer.parseInt(s);
		}
		return x % sum == 0;
	}
}