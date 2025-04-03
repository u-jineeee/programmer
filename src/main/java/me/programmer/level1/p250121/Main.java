package me.programmer.level1.p250121;

public class Main {
}
class Solution {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		String[] name = {"code", "date", "maximum", "remain"};
		int idx_ext = 0;
		int idx_sort = 0;
		int cnt = 0;
		int idx = 0;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(ext))
				idx_ext = i;
			if(name[i].equals(sort_by))
				idx_sort = i;
	}
		for (int[] d : data) {
			if (d[idx_ext] < val_ext)
				cnt++;
		}
		int[][] answer = new int[cnt][4];
		for (int[] d : data) {
			if (d[idx_ext] < val_ext)
				answer[idx++] = d;
		}
		for(int i = 0; i < answer.length-1; i++) {
			for(int j = i+1; j < answer.length; j++) {
				if(answer[i][idx_sort] > answer[j][idx_sort]) {
					int[] temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		return answer;
	}
}