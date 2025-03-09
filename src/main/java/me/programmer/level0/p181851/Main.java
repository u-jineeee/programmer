package me.programmer.level0.p181851;

public class Main {
}
class Solution {
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int cnt = 0;
		int[] x = {10000, 100, 1};

		for(int i = 1; i <= rank.length; i++) {
			if(cnt == 3)
				break;
			for(int j = 0; j < rank.length; j++) {
				if(rank[j] == i && attendance[j]){
					answer += j * x[cnt];
					cnt++;
				}
			}
		}
		return answer;
	}
}