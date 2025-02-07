package me.programmer.level0.p181897;

public class Main {
}
class Solution {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		int[] answer;
		switch (n) {
			case 1 -> {
				answer = new int[slicer[1] + 1];
				System.arraycopy(num_list, 0, answer, 0, slicer[1] + 1);
			}
			case 2 -> {
				answer = new int[num_list.length - slicer[0]];
				int cnt1 = 0;
				for (int i = slicer[0]; i < num_list.length; i++) {
					answer[cnt1++] = num_list[i];
				}
			}
			case 3 -> {
				answer = new int[slicer[1] - slicer[0] + 1];
				int cnt2 = 0;
				for (int i = slicer[0]; i <= slicer[1]; i++) {
					answer[cnt2++] = num_list[i];
				}
			}
			default -> {
				answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
				int cnt3 = 0;
				for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
					answer[cnt3++] = num_list[i];
				}
			}
		}
		return answer;
	}
}