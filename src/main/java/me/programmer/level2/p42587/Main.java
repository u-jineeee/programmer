package me.programmer.level2.p42587;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}
class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Process> queue = new LinkedList<>();
		for(int i = 0; i < priorities.length; i++) {
			queue.add(new Process(i, priorities[i]));
		}
		for(int i = 0; i < priorities.length-1; i++) {
			int max = 0;
			int index = 0;
			answer++;
			for(Process p : queue) {
				if(max <p.getPriority()) {
					max = p.getPriority();
					index = p.getLocation();
				}
			}

			for(Process process : queue) {
				if(process.getLocation() == index)
					break;
				int l = process.getLocation();
				int p = process.getPriority();
				queue.poll();
				queue.add(new Process(l, p));
			}
			queue.poll();
			if(location == index)
				return answer;
		}

		while(!queue.isEmpty()) {
			int priority = queue.peek().getPriority();

		}
		return ++answer;
	}
}
class Process {
	private int location;
	private int priority;

	public Process(int location, int priority) {
		this.location = location;
		this.priority = priority;
	}

	public int getLocation() {
		return location;
	}

	public int getPriority() {
		return priority;
	}
}