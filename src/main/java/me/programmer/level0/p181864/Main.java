package me.programmer.level0.p181864;

public class Main {
}
class Solution {
	public int solution(String myString, String pat) {
		for(int i = 0; i <= myString.length()-pat.length(); i++) {
			boolean flag = false;
			for(int j = 0; j < pat.length(); j++) {
				if(myString.charAt(i+j) == pat.charAt(j)){
					flag = false;
					break;
				}
				flag = true;
			}
			if(flag)
				return 1;
		}
		return 0;
	}
}