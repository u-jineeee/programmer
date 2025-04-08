package me.programmer.level1.p258712;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}
class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		List<String> friend_list = getFriendList(friends);
		int[][] gift_arr = getGiftArray(friends);
		Map<String, int[]> status_map = new HashMap<>();
		for(String friend : friends) {
			status_map.put(friend, new int[3]);
		}
		for(String gift : gifts) {
			String[] s = gift.split(" ");
			String giver = s[0];
			String receiver = s[1];
			int giver_idx = friend_list.indexOf(giver);
			int receiver_idx = friend_list.indexOf(receiver);

			gift_arr[giver_idx][receiver_idx]++;
		}
		for(int i = 0; i < gift_arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < gift_arr[i].length; j++) {
				sum += gift_arr[i][j];
			}
			int[] newArr = status_map.get(friends[i]);
			newArr[0] = sum;
		}
		for(int i = 0; i < gift_arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < gift_arr[i].length; j++) {
				sum += gift_arr[j][i];
			}
			int[] newArr = status_map.get(friends[i]);
			newArr[1] = sum;
		}
		for(Map.Entry<String, int[]> entry : status_map.entrySet()) {
			int[] newArr = entry.getValue();
			newArr[2] = newArr[0] - newArr[1];
		}
		for(int i = 0; i < gift_arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < gift_arr[i].length; j++) {
				if(i != j) {
					if(gift_arr[i][j] > gift_arr[j][i])
						sum++;
					else if(gift_arr[i][j] == gift_arr[j][i] && status_map.get(friends[i])[2] > status_map.get(friends[j])[2])
						sum++;
				}
			}
			if(sum > answer)
				answer = sum;
		}
		return answer;
	}
	public List<String> getFriendList(String[] friends) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, friends);
		return list;
	}
	public int[][] getGiftArray(String[] friends) {
		return new int[friends.length][friends.length];
	}
}
