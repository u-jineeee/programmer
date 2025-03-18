package me.programmer.level0.p120876;

public class Main {
}
class Solution {
	public int solution(int[][] lines) {
		int min = Math.min(lines[0][0], Math.min(lines[1][0], lines[2][0]));
		int max = Math.max(lines[0][1], Math.max(lines[1][1], lines[2][1]));
		int[] line = new int[max-min];
		int answer = 0;

		//lines[0], lines[1]
		if(lines[0][0] <= lines[1][0] && lines[0][1] > lines[1][0]) {
			if(lines[0][1] < lines[1][1]) {
				line = fillDuplicates(line, lines[1][0], lines[0][1], min);
			} else {
				line = fillDuplicates(line, lines[1][0], lines[1][1], min);
			}
		}if(lines[1][0] < lines[0][0] && lines[1][1] > lines[0][0]) {
			if(lines[1][1] < lines[0][1]) {
				line = fillDuplicates(line, lines[0][0], lines[1][1], min);
			} else {
				line = fillDuplicates(line, lines[0][0], lines[0][1], min);
			}
		}

		//lines[0], lines[2]
		if(lines[0][0] <= lines[2][0] && lines[0][1] > lines[2][0]) {
			if(lines[0][1] < lines[2][1]) {
				line = fillDuplicates(line, lines[2][0], lines[0][1], min);
			} else {
				line = fillDuplicates(line, lines[2][0], lines[2][1], min);
			}
		}
		if(lines[2][0] < lines[0][0] && lines[2][1] > lines[0][0]) {
			if(lines[2][1] < lines[0][1]) {
				line = fillDuplicates(line, lines[0][0], lines[2][1], min);
			} else {
				line = fillDuplicates(line, lines[0][0], lines[0][1], min);
			}
		}

		//lines[1], lines[2]
		if(lines[1][0] <= lines[2][0] && lines[1][1] > lines[2][0]) {
			if(lines[1][1] < lines[2][1]) {
				line = fillDuplicates(line, lines[2][0], lines[1][1], min);
			} else {
				line = fillDuplicates(line, lines[2][0], lines[2][1], min);
			}
		}
		if(lines[2][0] < lines[1][0] && lines[2][1] > lines[1][0]) {
			if(lines[2][1] < lines[1][1]) {
				line = fillDuplicates(line, lines[1][0], lines[2][1], min);
			} else {
				line = fillDuplicates(line, lines[1][0], lines[1][1], min);
			}
		}

		for (int x : line) {
			if (x == 1)
				answer++;
		}

		return answer;
	}
	public int[] fillDuplicates(int[] line, int x, int y, int min) {
		for(int i = x-min; i < y-min; i++) {
			line[i] = 1;
		}
		return line;
	}
}