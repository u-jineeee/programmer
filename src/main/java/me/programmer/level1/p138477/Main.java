package me.programmer.level1.p138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i  < answer.length; i++) {
			list.add(score[i]);
			list.sort(Collections.reverseOrder());
			if(i < k)
				answer[i] = list.get(i);
			else
				answer[i] = list.get(k-1);
		}
		return answer;
	}
}