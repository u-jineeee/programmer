package me.programmer.level0.p120868;

public class Main {
}
class Solution {
	public int solution(int[] sides) {
		int answer = 0;
		if(sides[0] > sides[1]){
			int temp = sides[0];
			sides[0] = sides[1];
			sides[1] = temp;
		}
		for(int i = sides[1] - sides[0] + 1; i <= sides[1]; i++) {
			answer++;
		}
		for(int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
			answer++;
		}
		return answer;
	}
}