package me.programmer.level1.p12933;

import java.util.Arrays;
import java.util.Collections;

public class Main {
}
class Solution {
	public long solution(long n) {
		StringBuilder answer = new StringBuilder();
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());
		for(String str : arr) {
			answer.append(str);
		}
		return Long.parseLong(answer.toString());
	}
}