package me.programmer.level0.p181900;

public class Main {
}
class Solution {
	public String solution(String my_string, int[] indices) {
		String[] strArray = my_string.split("");
		StringBuilder answer = new StringBuilder();

		for(int index : indices) {
			strArray[index] = "";
		}
		for(String str : strArray) {
			if(!str.isEmpty())
				answer.append(str);
		}
		return answer.toString();
	}
}