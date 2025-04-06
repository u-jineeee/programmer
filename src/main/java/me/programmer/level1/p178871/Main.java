package me.programmer.level1.p178871;

import java.util.HashMap;
import java.util.Map;

public class Main {
}
class Solution {
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playerMap = new HashMap<>();
		for(int i = 0; i < players.length; i++)
			playerMap.put(players[i], i);

		for(String calling : callings) {
			int idx = playerMap.get(calling);
			String temp = players[idx];
			players[idx] = players[idx - 1];
			players[idx - 1] = temp;

			playerMap.put(players[idx], idx);
			playerMap.put(players[idx-1], idx-1);
		}
		return players;
	}
}