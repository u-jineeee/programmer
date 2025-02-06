package me.programmer.level0.p120912;

public class Main {
}
class Solution {
	public int solution(int[] array) {
		int answer = 0;
		for(int num : array) {
			while(num > 6){
				int r = num % 10;
				num = num / 10;

				if(r == 7) {
					answer++;
				}
				if(r == 0) {
					if(num == 7) answer++;
					break;
				}
			}
		}
		return answer;
	}
}