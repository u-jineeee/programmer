package me.programmer.level1.p67256;

public class Main {
}
class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		int[][] phone = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
		int[] rightPoint = {3,0}, leftPoint = {3,2};

		for(int number : numbers) {
			int[] numberPoint = new int[2];
			for(int i = 0; i < phone.length; i++)
				for(int j = 0; j < phone[i].length; j++)
					if(phone[i][j] == number)
						numberPoint = new int[] {i, j};
			if(number == 1 || number == 4 || number == 7) {
				leftPoint = numberPoint;
				answer.append("L");
			} else if(number == 3 || number == 6 || number == 9) {
				rightPoint = numberPoint;
				answer.append("R");
			} else {
				int distL = Math.abs((numberPoint[0] - leftPoint[0])) + Math.abs((numberPoint[1] - leftPoint[1]));
				int distR = Math.abs((numberPoint[0] - rightPoint[0])) + Math.abs((numberPoint[1] - rightPoint[1]));
				if(distL == distR) {
					if(hand.equals("left")) {
						leftPoint = numberPoint;
						answer.append("L");
					} else {
						rightPoint = numberPoint;
						answer.append("R");
					}
				} else if(distL < distR){
					leftPoint = numberPoint;
					answer.append("L");
				} else {
					rightPoint = numberPoint;
					answer.append("R");
				}
			}
		}
		return answer.toString();
	}
}