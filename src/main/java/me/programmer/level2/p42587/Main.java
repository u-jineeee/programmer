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

		while(!queue.isEmpty()) {
			int l = queue.peek().getLocation();
			int p = queue.peek().getPriority();
			boolean flag = true;
			for(Process process : queue) {
				if(p < process.getPriority()) {
					queue.poll();
					flag = false;
					break;
				}
			}
			if(!flag)
				queue.add(new Process(l, p));
			else {
				answer++;
				queue.poll();
				if(location == l)
					break;
			}
		}
		return answer;
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