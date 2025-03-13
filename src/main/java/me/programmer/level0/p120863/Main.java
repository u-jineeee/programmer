package me.programmer.level0.p120863;

public class Main {
}
class Solution {
	public String solution(String polynomial) {
		String[] strArray = polynomial.split(" ");
		int sumX = 0;
		int sum = 0;
		for(int i = 0; i < strArray.length; i++) {
			String str = strArray[i];
			if(str.equals("+")) {
				continue;
			} else if(str.contains("x")) {
				if(str.length() == 1)
					sumX += 1;
				else {
					sumX += Integer.parseInt(str.substring(0, str.length()-1));
				}
			} else {
				sum += Integer.parseInt(str);
			}
		}
		String answer;
		if(sumX != 0 && sum != 0) {
			if(sumX == 1)
				answer = "x + " + sum;
			else
				answer = sumX + "x + " + sum;
		}
		else if(sum == 0) {
			if(sumX == 1)
				answer = "x";
			else
				answer = sumX + "x";
		}
		else
			answer = String.valueOf(sum);
		return answer;
	}
}