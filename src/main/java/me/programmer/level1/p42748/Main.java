package me.programmer.level1.p42748;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i = 0; i < answer.length; i++) {
			int[] newArray = new int[commands[i][1] - commands[i][0] + 1];
			for(int j = 0; j < newArray.length; j++) {
				newArray[j] = array[j+commands[i][0]-1];
			}
			Arrays.sort(newArray);
			answer[i] = newArray[commands[i][2]-1];
		}
		return answer;
	}
}