package me.programmer.level0.p120815;

public class Main {
}
class Solution {
	public int solution(int n) {
		for(int i = 1; ;i++){
			if((n*i) % 6 == 0)
				return (n*i) / 6;
		}
	}
}