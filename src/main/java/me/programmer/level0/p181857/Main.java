package me.programmer.level0.p181857;

public class Main {
}
class Solution {
	public int[] solution(int[] arr) {
		int[] powersOfTwo = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
		int cnt = 0;
		for(int power : powersOfTwo) {
			if(arr.length == 1 || arr.length == power)
				return arr;
			else if(arr.length < power) {
				cnt = power;
				break;
			}
		}
		int[] answer = new int[cnt];
		System.arraycopy(arr, 0, answer, 0, arr.length);
		for(int i = arr.length; i < cnt; i++) {
			answer[i] = 0;
		}
		return answer;
	}
}