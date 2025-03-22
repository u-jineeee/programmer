package me.programmer.level1.p86051;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		int idx = 0;
		Arrays.sort(numbers);
		for(int i = 0; i < 10; i++) {
			if(i != numbers[idx]){
				answer += i;
			} else if(idx < numbers.length-1){
				idx++;
			}
		}
		return answer;
	}
}