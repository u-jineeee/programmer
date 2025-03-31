package me.programmer.level1.p140108;

public class Main {
}
class Solution {
	public int solution(String s) {
		int answer = 1;
		char x = ' ';
		int xN = 0;
		int otherN = 0;
		for(char ch : s.toCharArray()) {
			if(otherN != 0 && xN == otherN) {
				answer++;
				xN = 0;
				otherN = 0;
				x = ' ';
			}
			if(x == ' ') {
				x = ch;
				xN++;
			} else if(x == ch)
				xN++;
			else {
				otherN++;
			}
		}
		return answer;
	}
}