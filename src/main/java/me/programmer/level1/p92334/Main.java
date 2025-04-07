package me.programmer.level1.p92334;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> id_map = new HashMap<>();
		Map<String, List<String>> report_map = new HashMap<>();

		for(String id : id_list) {
			id_map.put(id, 0);
		}
		for(String r : report) {
			String[] s = r.split(" ");
			String userId = s[0];
			String reportedId = s[1];
			List<String> users = report_map.computeIfAbsent(reportedId, k1 -> new ArrayList<>());

			if(!users.contains(userId))
				users.add(userId);

		}
		for(Map.Entry<String, List<String>> entry : report_map.entrySet()) {
			if(entry.getValue().size() >= k) {
				for(String s : entry.getValue()) {
					id_map.put(s, id_map.getOrDefault(s, 0) + 1);
				}
			}
		}
		for(int i = 0; i < id_list.length; i++) {
			answer[i] = id_map.get(id_list[i]);
		}
		return answer;
	}
}