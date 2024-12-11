package me.programmer.level0.p181888;

public class Main {
}
class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer;
		int cnt = 0;

		if(num_list.length%n == 0)
			answer = new int[num_list.length/n];
		else
			answer = new int[num_list.length/n + 1];

		for(int i = 0; i < num_list.length; i+= n) {
			answer[cnt++] = num_list[i];
		}
		return answer;
	}
}