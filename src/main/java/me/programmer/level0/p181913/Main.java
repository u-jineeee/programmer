package me.programmer.level0.p181913;

public class Main {
}
class Solution {
	public String solution(String my_string, int[][] queries) {
		for(int[] query : queries) {
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < query[0]; i++)
				str.append(my_string.charAt(i));
			for(int i = query[1]; i >= query[0]; i--)
				str.append(my_string.charAt(i));
			for(int i = query[1]+1; i < my_string.length(); i++)
				str.append(my_string.charAt(i));

			my_string = str.toString();
		}
		return my_string;
	}
}