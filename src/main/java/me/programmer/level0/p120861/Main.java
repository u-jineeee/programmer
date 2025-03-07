package me.programmer.level0.p120861;

public class Main {
}
class Solution {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];
		for(String key : keyinput) {
			switch (key) {
				case "up" -> answer[1]++;
				case "down" -> answer[1]--;
				case "left" -> answer[0]--;
				case "right" -> answer[0]++;
			}

			if(answer[0] > 0 && answer[0] > board[0]/2)
				answer[0] = board[0]/2;
			else if(answer[0] < 0 && answer[0] < -board[0]/2)
				answer[0] = -board[0]/2;
			else if(answer[1] > 0 && answer[1] > board[1]/2)
				answer[1] = board[1]/2;
			else if(answer[1] < 0 && answer[1] < -board[1]/2)
				answer[1] = -board[1]/2;
		}
		return answer;
	}
}