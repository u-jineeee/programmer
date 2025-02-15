package me.programmer.level0.p120852;

import java.util.Set;
import java.util.TreeSet;

public class Main {
}
class Solution {
	public int[] solution(int n) {
		Set<Integer> answer = new TreeSet<>();
		for(int i = 2; i <= n; i++) {
			if(isPrimeNumber(i) && n % i == 0) {
				n = n/i;
				answer.add(i);
				i--;
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	public boolean isPrimeNumber(int n) {
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				return false;
		return true;
	}
}