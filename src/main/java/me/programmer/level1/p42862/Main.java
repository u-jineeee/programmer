package me.programmer.level1.p42862;

public class Main {
}
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] student = new int[n];
		for(int x : lost) student[x-1] -= 1;
		for(int y : reserve) student[y-1] += 1;
		for(int i = 0; i < n; i++)
			if(student[i] >= 0)
				answer++;
		for(int i = 0; i < n; i++) {
			if(student[i] == 1) {
				if (i > 0 && student[i - 1] == -1){
					student[i-1]++;
					student[i]--;
					answer++;
				} else if(i < n-1 && student[i + 1] == -1) {
					student[i+1]++;
					student[i]--;
					answer++;
				}
			}
		}
		return answer;
	}
}