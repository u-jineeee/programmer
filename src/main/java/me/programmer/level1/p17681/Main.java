package me.programmer.level1.p17681;

public class Main {
}
class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[][] map1 = intToBinary(n, arr1);
		int[][] map2 = intToBinary(n, arr2);

		for(int i = 0; i < n; i++) {
			StringBuilder str = new StringBuilder();
			for(int j = n-1; j >= 0; j--) {
				if(map1[i][j] == 1 || map2[i][j] == 1)
					str.append("#");
				else
					str.append(" ");
			}
			answer[i] = str.toString();
		}

		return answer;
	}
	public int[][] intToBinary(int n, int[] arr) {
		int[][] map = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int idx = 0;
			while(x > 0) {
				map[i][idx++] = x % 2;
				x /= 2;
			}
		}
		return map;
	}
}