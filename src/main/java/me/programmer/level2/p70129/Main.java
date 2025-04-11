package me.programmer.level2.p70129;

public class Main {
}
class Solution {
	public int[] solution(String s) {
		int[] answer = new int[2];
		int c;
		while(!s.equals("1")) {
			for(int i = 0; i < s.length(); i++)
				if(s.charAt(i) == '0')
					answer[1]++;
			s = s.replaceAll("0", "");
			c = s.length();
			s = Integer.toBinaryString(c);
			answer[0]++;
		}
		return answer;
	}
}