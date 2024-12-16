package me.programmer.level0.p181901;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(int n, int k) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int x = k;

		while(x <= n){
			arrayList.add(x);
			x += k;
		}
		return arrayList.stream().mapToInt(Integer::intValue).toArray();
	}
}