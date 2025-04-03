package me.programmer.level1.p133502;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int n : ingredient) {
			list.add(n);
			while(list.size() >= 4) {
				int s = list.size();
				if(!(list.get(s-4) == 1
				&& list.get(s-3) == 2
				&& list.get(s-2) == 3
				&& list.get(s-1) == 1)) break;
				for(int i = 0; i < 4; i++)
					list.remove(list.size()-1);
				answer++;
			}
		}
		return answer;
	}
}