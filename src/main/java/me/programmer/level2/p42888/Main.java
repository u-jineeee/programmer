package me.programmer.level2.p42888;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
}
class Solution {
	public String[] solution(String[] record) {
		List<String[]> recordList = new ArrayList<>();
		Map<String, String> name = new TreeMap<>();

		for(String s : record) {
			String[] info = s.split(" ");
			if(info[0].equals("Enter") || info[0].equals("Leave"))
				recordList.add(new String[]{info[0], info[1]});
			if (!info[0].equals("Leave"))
				name.put(info[1], info[2]);
		}
		String[] answer = new String[recordList.size()];
		for(int i = 0; i < recordList.size(); i++) {
			String[] r = recordList.get(i);
			if(r[0].equals("Enter"))
				answer[i] = name.get(r[1]) + "님이 들어왔습니다.";
			else
				answer[i] = name.get(r[1]) + "님이 나갔습니다.";
		}
		return answer;
	}
}