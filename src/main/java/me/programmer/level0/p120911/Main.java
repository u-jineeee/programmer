package me.programmer.level0.p120911;

import java.util.Arrays;

public class Main {
}
class Solution {
	public String solution(String my_string) {
		my_string = my_string.toLowerCase();
		char[] charArray = my_string.toCharArray();
		Arrays.sort(charArray);

		return new String(charArray);
	}
}