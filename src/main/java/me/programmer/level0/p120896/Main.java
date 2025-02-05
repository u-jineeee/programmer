package me.programmer.level0.p120896;

import java.util.Arrays;

public class Main {
}
class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		StringBuilder str = new StringBuilder(s);

		for(int i = 0; i < s.length(); i++) {
			boolean flag = true;
			if(str.charAt(i) == '0')
				continue;
			for(int j = i+1; j < s.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = false;
					str.setCharAt(j, '0');
				}
			}
			if(flag) {
				answer.append(str.charAt(i));
			}
		}

		String x = answer.toString();
		char[] charA = x.toCharArray();
		Arrays.sort(charA);

		return new String(charA);
	}
}