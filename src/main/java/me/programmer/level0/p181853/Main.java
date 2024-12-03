package me.programmer.level0.p181853;

public class Main {
}
class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[5];

		for(int i = 0; i < num_list.length - 1; i++) {
			for(int j = i + 1; j < num_list.length; j++) {
				if(num_list[i] > num_list[j]) {
					int temp = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = temp;
				}
			}
		}

		System.arraycopy(num_list, 0, answer, 0, 5);
		return answer;
	}
}
