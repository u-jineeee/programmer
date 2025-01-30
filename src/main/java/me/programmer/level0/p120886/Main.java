package me.programmer.level0.p120886;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(String before, String after) {
		char[] charArrayB = before.toCharArray();
		char[] charArrayA = after.toCharArray();

		Arrays.sort(charArrayB);
		Arrays.sort(charArrayA);

		String strB = new String(charArrayB);
		String strA = new String(charArrayA);

		return strB.equals(strA) ? 1 : 0;
	}
}