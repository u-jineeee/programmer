package me.programmer.level1.p1845;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int solution(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int answer = 0;
		for (int num : nums) {
			if (!list.contains(num))
				list.add(num);
		}

		return Math.min(list.size(), nums.length / 2);
	}
}