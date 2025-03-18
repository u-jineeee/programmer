package me.programmer.level0.p120956;

public class Main {
}
class Solution {
	public int solution(String[] babbling) {
		String[] baby = {"aya", "ye", "woo", "ma"};
		int answer = 0;
		for(String str : babbling) {
			for(String x : baby)
				str = str.replaceFirst(x, " ");
			str = str.replace(" ", "");
			if(str.isEmpty())
				answer++;
		}
		return answer;
	}
}