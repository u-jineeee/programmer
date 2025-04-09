package me.programmer.level2.p12939;

public class Main {
}
class Solution {
	public String solution(String s) {
		String[] s_arr = s.split(" ");
		int[] i_arr = new int[s_arr.length];
		for(int i = 0; i < i_arr.length; i++)
			i_arr[i] = Integer.parseInt(s_arr[i]);
		int max = i_arr[0], min = i_arr[0];
		for (int j : i_arr) {
			max = Math.max(j, max);
			min = Math.min(j, min);
		}
		return min + " " + max;
	}
}