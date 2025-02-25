package me.programmer.level0.p120902;

public class Main {
}
class Solution {
	public int solution(String my_string) {
		String[] str = my_string.split(" ");
		int answer = Integer.parseInt(str[0]);
		boolean flag = true;

		for(int i = 1; i < str.length; i++){
			if(str[i].equals("+"))
				flag = true;
			else if(str[i].equals("-"))
				flag = false;
			else {
				if(flag)
					answer += Integer.parseInt(str[i]);
				else
					answer -= Integer.parseInt(str[i]);
			}
		}
		return answer;
	}
}