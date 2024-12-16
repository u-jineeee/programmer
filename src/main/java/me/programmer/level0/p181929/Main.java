package me.programmer.level0.p181929;

public class Main {
}
class Solution {
	public int solution(int[] num_list) {
		int multi = 1;
		int add = 0;

		for(int num : num_list) {
			multi *= num;
			add += num;
		}
		return multi > add*add ? 0 : 1;
	}
}