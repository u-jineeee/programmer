package me.programmer.level0.p120904;

public class Main {
}
class Solution {
	public int solution(int num, int k) {
		String str = String.valueOf(num);
		char[] charArray = str.toCharArray();

		for(int i = 0; i < charArray.length; i++) {
			if(Integer.parseInt(String.valueOf(charArray[i])) == k)
				return i+1;
		}

		return -1;
	}
}