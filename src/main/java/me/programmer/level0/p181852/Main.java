package me.programmer.level0.p181852;

public class Main {
}
class Solution {
	public int[] solution(int[] num_list) {
		for(int i = 0; i < num_list.length - 1; i++) {
			for(int j = i+1; j < num_list.length; j++) {
				if(num_list[i] > num_list[j]){
					int temp = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = temp;
				}
			}
		}
		int[] answer = new int[num_list.length-5];
		for(int i = 5, j = 0; i < num_list.length; i++, j++) {
			answer[j] = num_list[i];
		}
		return answer;
	}
}