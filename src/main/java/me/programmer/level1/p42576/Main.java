package me.programmer.level1.p42576;

import java.util.Arrays;

public class Main {
}
class Solution {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i = 0; i < completion.length; i++) {
			if(!completion[i].equals(participant[i]))
				return participant[i];
		}
		return participant[participant.length-1];
	}
}