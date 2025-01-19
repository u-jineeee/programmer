package me.programmer.level0.p181883;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		for(int[] query : queries){
			for(int i = query[0]; i <= query[1]; i++) {
				arr[i]++;
			}
		}
		return arr;
	}
}