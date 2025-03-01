package me.programmer.level0.p120894;

public class Main {
}
class Solution {
	public long solution(String numbers) {
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < numbers.length();) {
			char ch = numbers.charAt(i);
			if(ch == 'z'){
				str.append(0);
				i += 4;
			} else if(ch == 'o'){
				str.append(1);
				i += 3;
			} else if(ch == 't' && numbers.charAt(i+1) == 'w'){
				str.append(2);
				i += 3;
			} else if(ch == 't'){
				str.append(3);
				i += 5;
			} else if(ch == 'f' && numbers.charAt(i+1) == 'o'){
				str.append(4);
				i += 4;
			} else if(ch == 'f'){
				str.append(5);
				i += 4;
			} else if(ch == 's' && numbers.charAt(i+1) == 'i'){
				str.append(6);
				i += 3;
			} else if(ch == 's'){
				str.append(7);
				i += 5;
			} else if(ch == 'e'){
				str.append(8);
				i += 5;
			} else {
				str.append(9);
				i += 4;
			}
		}
		return Long.parseLong(str.toString());
	}
}