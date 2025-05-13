package me.programmer.level2.p42626;

import java.util.PriorityQueue;

public class Main {
}
class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int n : scoville)
			minHeap.add(n);
		while(minHeap.peek() < K) {
			if(minHeap.size() < 2)
				return -1;

			int x = minHeap.poll();
			int y = minHeap.poll();

			int newS = x + (y * 2);
			minHeap.add(newS);
			answer++;

		}

		return answer;
	}
}