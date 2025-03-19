package me.programmer.level0.p181898;

public class Main {
}
class Solution {
	public int solution(int[] arr, int idx) {
		for(int i = idx; i < arr.length; i++) {
			if(arr[i] == 1)
				return i;
		}
		return -1;
	}
}