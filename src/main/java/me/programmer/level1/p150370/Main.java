package me.programmer.level1.p150370;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> termsMap = new HashMap<>();
		for(String term : terms) {
			termsMap.put(String.valueOf(term.charAt(0)), Integer.parseInt(term.substring(2)));
		}
		for(int i = 0; i < privacies.length; i++) {
			String[] split = privacies[i].split(" ");
			String x = split[1];
			if(isInformationDel(today, split[0], termsMap.get(x)))
				answer.add(i+1);

		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	public boolean isInformationDel(String today, String privacy, Integer termDay) {
		String[] todayArr = today.split("\\.");
		String[] privacyArr = privacy.split("\\.");
		int day = Integer.parseInt(privacyArr[2]);
		int y = Integer.parseInt(privacyArr[1]) + termDay;
		int month = y % 12 == 0 ? 12 : y % 12;
		int year = y % 12 == 0 ? Integer.parseInt(privacyArr[0]) + y / 12 - 1 : Integer.parseInt(privacyArr[0]) + y / 12;

		if(year > Integer.parseInt(todayArr[0]))
			return false;
		else if(year < Integer.parseInt(todayArr[0]))
			return true;
		else {
			if(month > Integer.parseInt(todayArr[1]))
				return false;
			else if(month < Integer.parseInt(todayArr[1]))
				return true;
			else {
				return day <= Integer.parseInt(todayArr[2]);
			}
		}
	}
}