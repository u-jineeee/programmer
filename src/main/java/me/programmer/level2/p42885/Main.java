package me.programmer.level2.p42885;

import java.util.Arrays;

public class Main {
}
class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		int left = 0;
		int right = people.length-1;
		Arrays.sort(people);

		while(left <= right) {
			if(people[left] + people[right] <= limit)
				left++;
			right--;
			answer++;
		}

 		return answer;
	}
}