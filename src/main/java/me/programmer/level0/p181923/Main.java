package me.programmer.level0.p181923;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for(int i = 0; i < queries.length; i++){
			int x = -1;
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(x == -1 && arr[j] > queries[i][2])
					x = arr[j];
				else if(arr[j] > queries[i][2] && x != -1 && arr[j] < x){
					x = arr[j];
				}
			}
			answer[i] = x;
		}
		return answer;
	}
}