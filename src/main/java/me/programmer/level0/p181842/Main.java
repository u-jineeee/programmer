package me.programmer.level0.p181842;

public class Main {
}
class Solution {
	public int solution(String str1, String str2) {
		for(int i = 0; i <= str2.length()-str1.length(); i++) {
			boolean flag = false;
			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(i+j)) {
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