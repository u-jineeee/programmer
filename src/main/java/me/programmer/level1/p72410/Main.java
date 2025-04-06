package me.programmer.level1.p72410;

public class Main {
}
class Solution {
	public String solution(String new_id) {
		String regex1 = "[^a-z0-9._-]";
		String regex2 = "\\.{2,}";
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll(regex1, "");
		new_id = new_id.replaceAll(regex2, ".");
		if(new_id.charAt(0) == '.')
			new_id = new_id.substring(1);
		if(!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.')
			new_id = new_id.substring(0, new_id.length()-1);
		if(new_id.isEmpty())
			new_id = "a";
		if(new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			if(new_id.charAt(new_id.length()-1) == '.')
				new_id = new_id.substring(0, new_id.length()-1);
		}
		StringBuilder answer = new StringBuilder(new_id);
		while(answer.length() < 3) {
			answer.append(answer.charAt(answer.length() - 1));
		}
		return answer.toString();
	}
}