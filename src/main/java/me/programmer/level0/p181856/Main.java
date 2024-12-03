package me.programmer.level0.p181856;

public class Main {
}
class Solution {
	public int solution(int[] arr1, int[] arr2) {
		if(arr1.length == arr2.length) {
			int total1 = 0;
			int total2 = 0;
			for(int x : arr1) {
				total1 += x;
			}
			for(int y: arr2) {
				total2 += y;
			}
			if(total1 == total2)
				return 0;
			else
				return total1 < total2 ? -1 : 1;
		}
		else
			return arr1.length < arr2.length ? -1 : 1;
	}
}