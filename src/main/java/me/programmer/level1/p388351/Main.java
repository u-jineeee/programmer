package me.programmer.level1.p388351;

public class Main {
}
class Solution {
	public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = 0;
		int[] weeks = new int[7];
		for(int i = 0; i < 7; i++) {
			if(startday > 7)
				startday = 1;
			weeks[i] = startday++;
		}
		for(int i = 0; i < timelogs.length; i++) {
			int time = schedules[i]/100 * 60 + schedules[i]%100 + 10;
			boolean flag = false;
			for(int j = 0; j < timelogs[i].length; j++) {
				if(weeks[j] > 5)
					continue;
				int timelog = timelogs[i][j]/100 * 60 + timelogs[i][j]%100;
				if(time < timelog) {
					flag = false;
					break;
				} else
					flag = true;
			}
			if(flag)
				answer++;
		}
		return answer;
	}
}