package me.programmer.level1.p87389;

public class Main {
}
class Solution {
	public int solution(int n) {
		for(int i = 2; ; i++) {
			if(n % i == 1)
				return i;
		}
	}
}