package me.programmer.level0.p120811;

public class Main {
}
class Solution {
	public int solution(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int flag = array[i];
					array[i] = array[j];
					array[j] = flag;
				}
			}
		}
		return array[array.length/2];
	}
}