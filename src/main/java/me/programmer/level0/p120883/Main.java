package me.programmer.level0.p120883;

public class Main {
}
class Solution {
	public String solution(String[] id_pw, String[][] db) {
		boolean flag = false;
		for(String[] x : db){
			if(id_pw[0].equals(x[0]) && id_pw[1].equals(x[1]))
				return "login";
			else if(id_pw[0].equals(x[0]))
				flag = true;
		}
		if(flag)
			return "wrong pw";
		return "fail";
	}
}