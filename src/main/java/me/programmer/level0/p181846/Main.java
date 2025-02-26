package me.programmer.level0.p181846;

public class Main {
}
class Solution {
	public String solution(String a, String b) {
		StringBuilder answer = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;

		while(i >= 0 || j >= 0 || carry > 0){
			int sum = carry;

			if(i >= 0){
				sum += a.charAt(i) - '0';
				i--;
			}
			if(j >= 0){
				sum += b.charAt(j) - '0';
				j--;
			}
			answer.append(sum % 10);
			carry = sum / 10;
		}
		return answer.reverse().toString();
	}
}