package me.programmer.level1.p136798;

public class Main {
}
class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] arr = new int[number];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = countDivisors(i+1);
			if(arr[i] > limit)
				answer += power;
			else
				answer += arr[i];
		}

		return answer;
	}
	public int countDivisors(int n) {
		int count = 0;
		int sqrtN = (int)Math.sqrt(n);
		for(int i = 1; i <= sqrtN; i++) {
			if(n % i == 0) {
				count++;
				if(i != n / i)
					count++;
			}
		}
		return count;
	}
}