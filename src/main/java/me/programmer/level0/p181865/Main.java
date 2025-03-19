package me.programmer.level0.p181865;

public class Main {
}
class Solution {
	public int solution(String binomial) {
		int answer = 0;
		String[] str = binomial.split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		switch(str[1]) {
			case "+" -> answer = x + y;
			case "-" -> answer = x - y;
			case "*" -> answer = x * y;
		}
		return answer;
	}
}