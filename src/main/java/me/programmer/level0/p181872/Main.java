package me.programmer.level0.p181872;

public class Main {
}
class Solution {
	public String solution(String myString, String pat) {
		int idx = 0;
		boolean flag = false;
		for(int i = 0; i <= myString.length()-pat.length(); i++) {
			for(int j = 0; j < pat.length(); j++) {
				if(myString.charAt(i+j) != pat.charAt(j)){
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if(flag){
				idx = i+pat.length();
			}
		}
		return myString.substring(0, idx);
	}
}