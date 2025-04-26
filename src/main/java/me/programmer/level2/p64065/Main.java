package me.programmer.level2.p64065;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int[] solution(String s) {
		String trimmed = s.substring(2, s.length()-2);
		String[] setStrings = trimmed.split("},\\{");
		List<List<Integer>> sets = new ArrayList<>();
		for(String str : setStrings) {
			String[] arr = str.split(",");
			List<Integer> intArr = new ArrayList<>();
			for(String num : arr) {
				intArr.add(Integer.parseInt(num));
			}
			sets.add(intArr);
		}
		sets.sort(((o1, o2) -> Integer.compare(o1.size(), o2.size())));
		List<Integer> answer = new ArrayList<>();
		for(List<Integer> list : sets) {
			if(answer.isEmpty())
				answer.add(list.get(0));
			else {
				for(Integer n : answer) {
					list.remove(n);
				}
				answer.add(list.get(0));
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}