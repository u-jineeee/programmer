package me.programmer.level0.p120813;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public int[] solution(int n) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int x = 1;
		while (x <= n) {
			arrayList.add(x);
			x = x + 2;
		}

		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}
