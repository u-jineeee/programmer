package me.programmer.level0.p120869;

public class Main {
}
class Solution {
	public int solution(String[] spell, String[] dic) {
		for(String str : dic){
			if(str.length() != spell.length)
				continue;
			for(String s : spell){
				str = str.replaceFirst(s, "");
			}
			if(str.isEmpty())
				return 1;
		}
		return 2;
	}
}