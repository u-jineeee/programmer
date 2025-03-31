package me.programmer.level1.p133499;

public class Main {
}
class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] baby = {"aya", "ye", "woo", "ma"};
		for(String s : babbling) {
			for (int i = 0; i < baby.length; i++)
				s = s.replaceAll(baby[i], String.valueOf(i));
			if(s.matches("\\d+")) {
				boolean flag = true;
				for(int j = 0; j < s.length()-1; j++) {
					if(s.charAt(j) == s.charAt(j+1)) {
						flag = false;
						break;
					}
				}
				if(flag)
					answer++;
			}
		}
		return answer;
	}
}