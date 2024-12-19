package me.programmer.level0.p181840;

public class Main {
}
class Solution {
	public int solution(int[] num_list, int n) {
		for(int num:num_list)
			if(num == n)
				return 1;

		return 0;
	}
}