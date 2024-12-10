package me.programmer.level0.p181887;

public class Main {
}
class Solution {
	public int solution(int[] num_list) {
		int even = 0, odd = 0;
		for(int i = 0; i < num_list.length; i++) {
			if(i % 2 == 0)
				even += num_list[i];
			else
				odd += num_list[i];
		}
		return Math.max(even, odd);
	}
}