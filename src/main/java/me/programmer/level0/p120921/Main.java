package me.programmer.level0.p120921;

public class Main {
}
class Solution {
	public int solution(String A, String B) {
		StringBuilder str = new StringBuilder(A);
		for(int i = 0; i < A.length(); i++){
			if(B.equals(str.toString()))
				return i;

			char lastChar = str.charAt(A.length()-1);
			str.deleteCharAt(A.length()-1);
			str.insert(0, lastChar);
		}
		return -1;
	}
}