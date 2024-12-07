package me.programmer.level0.p181874;

public class Main {
}
class Solution {
	public String solution(String myString) {
		myString = myString.toLowerCase();
		myString = myString.replaceAll("a", "A");
		return myString;
	}
}