package me.programmer.level1.p17682;

public class Main {
}
class Solution {
	public int solution(String dartResult) {
		int[] score = new int[3];
		int cnt = 0;
		boolean flag = false;
		String[] dartArray = dartResult.split("");
		for(String dart : dartArray) {
			if(flag && dart.equals("0")) {
				score[cnt - 1] = 10;
				continue;
			}
			flag = false;
			switch (dart) {
				case "S" ->
					score[cnt-1] = (int)Math.pow(score[cnt-1], 1);
				case "D" ->
					score[cnt-1] = (int)Math.pow(score[cnt-1], 2);
				case "T" ->
					score[cnt-1] = (int)Math.pow(score[cnt-1], 3);
				case "*" -> {
					if (cnt == 1)
						score[0] *= 2;
					else {
						score[cnt - 2] *= 2;
						score[cnt - 1] *= 2;
					}
				}
				case "#" ->
					score[cnt - 1] = -score[cnt - 1];
				default -> {
					if (dart.equals("1"))
						flag = true;
					score[cnt] = Integer.parseInt(dart);
					cnt++;
				}
			}
		}
		return score[0] + score[1] + score[2];
	}
}