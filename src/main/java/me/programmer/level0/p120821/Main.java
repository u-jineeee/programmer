package me.programmer.level0.p120821;

public class Main {
}
class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];

		for (int i = num_list.length-1, j = 0; i >= 0; i--) {
			answer[j++] = num_list[i];
		}
		return answer;
	}
}
