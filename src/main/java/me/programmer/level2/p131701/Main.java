package me.programmer.level2.p131701;

import java.util.HashSet;
import java.util.Set;

public class Main {
}
class Solution {
	public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		for(int i = 1; i <= elements.length; i++) {
			for(int j = 0; j < elements.length; j++) {
				int cnt = 0;
				int sum = 0;
				while(cnt != i) {
					sum += elements[(j+cnt)%elements.length];
					cnt++;
				}
				set.add(sum);
			}
		}
		return set.size();
	}
}