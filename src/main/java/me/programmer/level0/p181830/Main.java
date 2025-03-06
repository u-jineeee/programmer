package me.programmer.level0.p181830;

public class Main {
}
class Solution {
	public int[][] solution(int[][] arr) {
		if(arr.length == arr[0].length)
			return arr;

		int[][] answer;
		if(arr.length > arr[0].length) {
			answer = new int[arr.length][arr.length];

			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(j >= arr[0].length)
						answer[i][j] = 0;
					else
						answer[i][j] = arr[i][j];
				}
			}
		}

		else{
			answer = new int[arr[0].length][arr[0].length];

			for(int i = 0; i < arr[0].length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					if(i >= arr.length)
						answer[i][j] = 0;
					else
						answer[i][j] = arr[i][j];
				}
			}
		}

		return answer;
	}
}