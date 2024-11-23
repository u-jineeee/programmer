package me.programmer.level0.p120824;

public class Main {
}
class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = {0, 0};
		int e = 0;
		int o = 0;

		for (int num : num_list) {
			if (num%2 == 0) e++;
			else o++;
		}

		answer[0] = e;
		answer[1] = o;
		return answer;
	}
}
