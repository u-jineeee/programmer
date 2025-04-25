package me.programmer.level2.p17680;

import java.util.ArrayDeque;
import java.util.Deque;

public class main {
}

class Solution {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		int hitTime = 1;
		int missTime = 5;
		Deque<String> deque = new ArrayDeque<>();

		if (cacheSize == 0)
			return missTime * cities.length;
		for (String city : cities) {
			String lowerCity = city.toLowerCase();
			if (deque.contains(lowerCity)) {
				deque.remove(lowerCity);
				answer += hitTime;
			}
			else if (deque.size() < cacheSize) {
				answer += missTime;
			} else {
				deque.removeFirst();
				answer += missTime;
			}
			deque.add(lowerCity);
		}
		return answer;
	}
}