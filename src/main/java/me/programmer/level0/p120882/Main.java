package me.programmer.level0.p120882;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int[] solution(int[][] score) {
		double[] avg = new double[score.length];
		int[] answer = new int[score.length];

		for(int i = 0; i < score.length; i++) {
			avg[i] = (double)(score[i][0] + score[i][1])/2;
		}
		double[] rank = Arrays.copyOf(avg, score.length);
		Arrays.sort(rank);

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < avg.length; j++) {
				if(avg[i] == rank[j]){
					answer[i] = score.length - j;
				}
			}
		}
		return answer;
	}
}