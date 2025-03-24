package me.programmer.level1.p12917;

public class Main {
}
class Solution {
	public String solution(String s) {
		char[] ch = s.toCharArray();
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < ch.length-1; i++) {
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(char c : ch)
			answer.append(c);
		return answer.toString();
	}
}