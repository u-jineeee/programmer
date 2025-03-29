package me.programmer.level1.p42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int[] answers) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] score = new int[3];
		List<Integer> answer = new ArrayList<>();

		for(int i = 0; i < answers.length; i++) {
			int x = answers[i];
			if(x == a[i%5])
				score[0]++;
			if(x == b[i%8])
				score[1]++;
			if(x == c[i%10])
				score[2]++;
		}

		int max = Math.max(score[0], Math.max(score[1], score[2]));
		for(int i = 0; i < score.length; i++) {
			if(score[i] == max)
				answer.add(i+1);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}