package me.programmer.level0.p181871;

public class Main {
}
class Solution {
	public int solution(String myString, String pat) {
		int answer = 0;
		for(int i = 0; i <= myString.length() - pat.length(); i++){
			boolean flag = false;
			for(int j = 0; j < pat.length(); j++){
				if(myString.charAt(i+j) == pat.charAt(j)){
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if(flag)
				answer++;
		}

		return answer;
	}
}