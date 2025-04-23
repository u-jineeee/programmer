package me.programmer.level2.p42586;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();
		int[] time = new int[progresses.length];
		for(int i = 0; i < progresses.length; i++) {
			time[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
		}
		int day = time[0];
		int cnt = 0;
		for(int x : time) {
			if(day >= x) {
				cnt++;
			} else {
				list.add(cnt);
				day = x;
				cnt = 1;
			}
		}
		list.add(cnt);
 		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}