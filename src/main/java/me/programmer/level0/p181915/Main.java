package me.programmer.level0.p181915;

public class Main {
}
class Solution {
	public String solution(String my_string, int[] index_list) {
		StringBuilder answer = new StringBuilder();

		for (int i : index_list) {
			answer.append(my_string.charAt(i));
		}
		return answer.toString();
	}
}