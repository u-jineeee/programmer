package me.programmer.level2.p131704;

import java.util.Stack;

public class Main {
}
class Solution {
	public int solution(int[] order) {
		int answer = 0;
		Stack<Integer> secondary = new Stack<>();
		int pacel = 1;
		for(int n : order) {
			while (pacel <= order.length) {
				if (pacel == n) {
					answer++;
					if(pacel != order.length)
						pacel++;
					break;
				}
				if (!secondary.isEmpty() && secondary.peek() == n) {
					secondary.pop();
					answer++;
					break;
				} else if(pacel < n){
					secondary.add(pacel);
					pacel++;
				} else {
					return answer;
				}
			}
		}
		return answer;
	}
}