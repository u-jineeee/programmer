package me.programmer.level0.p181922;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		for (int[] query : queries) {
			for (int i = query[0]; i <= query[1]; i++) {
				if(i == 0 || i % query[2] == 0)
					arr[i] = arr[i]+1;
			}
		}
		return arr;
	}
}