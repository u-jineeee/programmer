package me.programmer.level0.p181890;

import java.util.ArrayList;

public class Main {
}
class Solution {
	public String[] solution(String[] str_list) {
		ArrayList<String> answer = new ArrayList<>();
		boolean flag = false;
		for(String str : str_list){
			if(str.equals("l") && !flag){
				flag = true;
				break;
			} else if(str.equals("r")) {
				answer = new ArrayList<>();
				flag = true;
			}
			answer.add(str);
		}
		if(!flag)
			return new String[]{};
		return answer.toArray(String[]::new);
	}
}