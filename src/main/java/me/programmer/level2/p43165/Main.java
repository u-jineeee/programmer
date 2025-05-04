package me.programmer.level2.p43165;

public class Main {
}
class Solution {
	public int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
	}
	public int dfs(int[] numbers, int target, int index, int currentSum) {
		if(index == numbers.length) {
			if (currentSum == target)
				return 1;
			else
				return 0;
		}
		int cnt = 0;
		cnt += dfs(numbers, target, index + 1, currentSum + numbers[index]);
		cnt += dfs(numbers, target, index + 1, currentSum - numbers[index]);

		return cnt;
	}
}