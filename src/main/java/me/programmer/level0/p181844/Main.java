package me.programmer.level0.p181844;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> answer = new ArrayList<>();

		for(int a : arr) {
			boolean isEqual = false;
			for(int d : delete_list) {
				if(a == d) {
					isEqual = true;
					break;
				}
			}
			if(!isEqual)
				answer.add(a);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}