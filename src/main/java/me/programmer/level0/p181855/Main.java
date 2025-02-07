package me.programmer.level0.p181855;

public class Main {
}
class Solution {
	public int solution(String[] strArr) {
		int answer = 0;
		int[] length = new int[30];
		for(String str : strArr) {
			length[str.length()-1]++;
		}
		for(int len : length) {
			if(len > answer)
				answer = len;
		}
		return answer;
	}
}