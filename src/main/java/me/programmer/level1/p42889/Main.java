package me.programmer.level1.p42889;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int[] solution(int N, int[] stages) {
		Map<Integer, Double> failureRates = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int failures = 0;
			int successes = 0;
			for(int stage : stages) {
				if(i+1 == stage)
					failures++;
				else if(i+1 < stage)
					successes++;
			}
			if(failures == 0)
				failureRates.put(i+1, (double)0);
			else
				failureRates.put(i+1, (double)failures / (failures+successes));
		}
		List<Map.Entry<Integer, Double>> answer = new ArrayList<>(failureRates.entrySet());
		answer.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		return answer.stream().map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();
	}
}