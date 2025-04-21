package me.programmer.level2.p131127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Solution {
	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		List<String> wantList = new ArrayList<>();
		Collections.addAll(wantList, want);
		for(int i = 0; i <= discount.length-10; i++) {
			int[] basket = new int[number.length];
			boolean flag1 = true;
			for(int j = 0; j < 10; j++) {
				if(wantList.contains(discount[i+j])) {
					int idx = wantList.indexOf(discount[i+j]);
					basket[idx]++;
					if(number[idx] < basket[idx]) {
						flag1 = false;
						break;
					}
				} else {
					flag1 = false;
					break;
				}
			}
			if(flag1) {
				boolean flag2 = true;
				for (int j = 0; j < number.length; j++)
					if (number[j] != basket[j]) {
						flag2 = false;
						break;
					}
				if (flag2)
					answer++;
			}
		}
		return answer;
	}
}