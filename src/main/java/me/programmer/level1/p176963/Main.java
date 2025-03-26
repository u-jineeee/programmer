package me.programmer.level1.p176963;

public class Main {
}
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		for(int i = 0; i < photo.length; i++) {
			for(String str : photo[i]) {
				for(int j = 0; j < name.length; j++) {
					if(str.equals(name[j])) {
						answer[i] += yearning[j];
						break;
					}
				}
			}
		}
		return answer;
	}
}