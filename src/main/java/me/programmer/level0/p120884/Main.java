package me.programmer.level0.p120884;

public class Main {
}
class Solution {
	public int solution(int chicken) {
		int answer = 0;
		while(chicken / 10 != 0){
			int c = chicken/10;
			answer += c;
			chicken = c + chicken%10;
		}
		return answer;
	}
}